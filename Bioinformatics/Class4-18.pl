srand(time|$$);


$range = 200;
$sum = 15;

$avg;
$high = $range - $range -1;
$low = $range + 1;
$run = 1000;
$i  = 0;



while($i < $run)
{
	$x=0;
	$count = 0;
	while($x!=$)
	{
		$x = int(rand($range));
		$count = $count+1;
	}
	if($count < $low)
	{
		$low = $count;
	}
	else
	{
		$high = $count;
	}
	
	print "\n", $x, " ", $count;
	
	$i++;
	
}

print "\nLow: " , $low, " High: ", $high; 