$seq1 = "GCGGTT";
$seq2 = "CCGC";
$len1 = length($seq1) + 1;
$len2 = length($seq2) + 1;
$matchscore = 1;
$mismatchscore = 0;
$gapscore = -1;

@matrix = ();
for($i = 0; $i < $len1; $i++)
{
	for($j = 0; $j < $len2; $j++)
	{
		$matrix[$i][$j] = ' ';
	}
}

$matrix[0][0] = 0;
for($i = 1; $i < $len1; $i++)
{
	$matrix[$i][0] = $matrix[$i - 1] [0] + $gapscore;
}
for($j = 1; $j < $len1; $j++)
{
	$matrix[0][$j] = $matrix[0] [$j - 1] + $gapscore;
}

for($x = 1; $x < $len1; $x++)
{
	for($y =1; $y < $len2; $y++)
	{
		$val1 = $matrix[$x][$y-1] + $gapscore;
		$val2 = $matrix[$x-1][$y] + $gapscore;
		if(substr($seq1, $x - 1, 1) eq substr($seq2, $y -1, 1))
		{
			$val3 = $matrix[$x-1][$y-1] + $matchscore;
		}
		else
		{
			$val3 = $matrix[$x-1][$y-1] + $mismatchscore;
		}
		if(($val1 >= $val2) && ($val1 >= $val3))
		{
			$matrix[$x][$y] = $val1;
		}
		elsif(($val2 >= $val1) && ($val2 >= $val3))
		{
			$matrix[$x][$y] = $val2;
		}
		else
		{
			$matrix[$x][$y] = $val3;
		}
	}
}


for($i = 0; $i < $len1; $i++)
{
	
	for ($j=0; $j < $len2; $j++)
	{
		print $matrix[$i][$j], "\t";
	}
	print "\n";
}
