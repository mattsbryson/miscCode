package util;

import java.lang.management.*;
import static java.lang.management.ManagementFactory.*;

public class PerformanceMonitor { 
    private int  availableProcessors = getOperatingSystemMXBean().getAvailableProcessors();
    private long lastSystemTime      = 0;
    private long lastProcessCpuTime  = 0;

    public synchronized double getCpuUsage()
    {
        if ( lastSystemTime == 0 )
        {
            baselineCounters();
            return 0;
        }

        long systemTime     = System.nanoTime();
        long processCpuTime = 0;

        if ( getOperatingSystemMXBean() instanceof OperatingSystemMXBean )
        {
            processCpuTime = ( (com.sun.management.OperatingSystemMXBean) getOperatingSystemMXBean() ).getProcessCpuTime();
        }

        double cpuUsage = (double) ( processCpuTime - lastProcessCpuTime ) / ( systemTime - lastSystemTime );

        lastSystemTime     = systemTime;
        lastProcessCpuTime = processCpuTime;

        return cpuUsage / availableProcessors;
    }

    private void baselineCounters()
    {
        lastSystemTime = System.nanoTime();

        if ( getOperatingSystemMXBean() instanceof OperatingSystemMXBean )
        {
            lastProcessCpuTime = ( (com.sun.management.OperatingSystemMXBean) getOperatingSystemMXBean() ).getProcessCpuTime();
        }
    }
}