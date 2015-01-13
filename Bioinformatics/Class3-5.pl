@myArray =();
@myArray=([5,13,-1,89,9],[34,21,6,9,10],[6,41,20,30,49]);

for($i = 0; $i<3;$i++)
{
	print "\n";
	for ($j=0;$j<5;$j++)
	{
		if($j == 4)
		{
			print $myArray[$i][$j];
			
		}
		else
		{
			print $myArray[$i][$j], "\t|\t ";	
		}
		
	}
	
}

