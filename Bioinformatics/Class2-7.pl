#elsif is the else if command in pl. 

print "Enter single DNA strand: ";
$dnaseq = <STDIN>;
chomp $dnaseq;
#print "\n opposite strand: ";

#for($i=0;$i<length($dnaseq);$i++)
#{
#$nucleo = substr($dnaseq, $i, 1);
#	if ($nucleo eq "A")
#	{
#		print "T";	
#	}
#	elsif($nucleo eq "C")
#		print "G";
#	}
#	elsif($nucleo eq "G")
#	{
#		print "C";
#	}
#	{
#		print "A";
#	}
#
#}

print "Here are your neucleotides! \n";

$rnaseq = "";
for($y=0;$y<length($dnaseq);$y = $y + 3)
{
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
	
	print substr($rnaseq, $y, 3),"\n";
}


@array1 = ();
@array1 = ("A", 1 + 1,"T","G");
print $array1[1];



@numbers = (2,8,3,4,19,8,5);
for($i = 0; $i < scalar(@numbers);$i++)
{
	print $numbers[$i], " ";
}