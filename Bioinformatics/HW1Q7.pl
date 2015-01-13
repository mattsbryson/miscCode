print "Enter single DNA strand: ";
$dnaseq = <STDIN>;
chomp $dnaseq;

$rnaseq = "";

	for($i=0;$i<length($dnaseq);$i++)
	{
	$nucleo = substr($dnaseq, $i, 1);
		if ($nucleo eq "A")
		{
			$rnaseq = $rnaseq."T";	
		}
		elsif($nucleo eq "C")
		{
			$rnaseq = $rnaseq."G";
		}
		elsif($nucleo eq "G")
		{
			$rnaseq = $rnaseq."C";
		}
		else
		{
			$rnaseq = $rnaseq."A";
		}
	}
	
#Please note, this would not be an actual RNA sequence, 
#just the opposite side of the DNA because Uracil isn't substituted for Thymine. 	
print $rnaseq,"\n";
