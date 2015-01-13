srand(time|$$);
#$myString="CCGTACCATACA";
$myString="ATATTCCGATTTAGGC";

for($i=0;$i<5;$i++)
{
	$x = rand(16);
	$y = rand(16);
	#print "\n", $x, "\t", "integer value = ", int($x); 
	$x = int($x);
	$y = int($y);
	$start = 0; 
	$end = 0;
	if($x > $y)
	{
		$start = $y;
		$end = $x;
	}
	else
	{
		$start = $x;
		$end = $y;
	}
	print substr($myString, $start, ($start - $end)), "\n";
}