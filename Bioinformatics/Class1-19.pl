#Matt Bryson - Jan 29

#variables
$a = 5; 
$b = $a + 10;
$c = $b * 10;
$a = $a -1;
$x = 3;

$s1 = "matt";
$s2 = "bob";

print "The value of a is: ", $a , "\n";
print "The value of b is: ", $b , "\n";
print "The value of c is: ", $c , "\n";

if($x == 7)
{
	print "good number\n";
}
else
{
	print"bad number\n";
}

if($a == $c)
{
	print "a is equal to c\n";
}
else
{
	print"a is not equal to c\n";
}



print "Enter non-template DNA strand in captial letters: ";
$dnaseq = <STDIN>;
chomp $dnaseq;
chomp $s1;

#print $dnaseq , "\n";
$infile = "";


open(infile,'dnadata.txt');
$data = <infile>;
chomp $data;
close infile;

print $data;



