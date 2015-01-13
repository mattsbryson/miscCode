$x = "Bio"."informatics"; #this is an example of concatination 
print $x;

open("infile", 'dnadata.txt');

while($data = <infile>)   #file reader 
{
	chomp $data;
	print "\n",$data;
}

open("infile", 'dnadata.txt');
$dnaseq="";
$i = 0;
while($data = <infile>)
{
	chomp $data;
	if($i > 0)
	{
		$dnaseq = $dnaseq.$data;
	}
	$i++;
}


#repetition is accomplished with the x<number>
$rep = 'CGAT' x4;
print $rep;


$position = 6;
$numLetters = 5;
$mySub = substr("Hello World", $position, $numLetters);
print "\n",$mySub;

$x = "CGGGACT";
$y= "UCAAG";
$sub2 = "";
#CGGAG
$sub2 = substr($x, 0, 3).substr($y, 3, 2);
print "\n", $sub2;

$y = 0;
$rnaseq = "GGCGGUGCCGUG";
#while($y < 12)
#{
#	print "\n";
#	print substr($rnaseq, $y, 3);
#	$y = $y + 3;
#}


print "\n";
for($s= 0; $s < 5; $s++)
{
	print" hello ",$s;
}


for($q = 0; $q < 12; $q += 3)
{
	print "\n";
	print substr($rnaseq, $q, 3);
}







