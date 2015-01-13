# reverse(); is the reverse operator in perl
# tr - transliteration (substituting) g - globally 
# this is used tr/abc/def/g;
#when using template dna, it should be reversed for the rna. 

#Changes template strand to RNA sequence. 
#print "Enter template DNA strand in capital letters: ";
#$dnaseq = <STDIN>;
#chomp $dnaseq;
#$rnaseq = reverse($dnaseq);
#$rnaseq =~tr/ACGT/UGCA/;		
#print "DNA: 5\'- $dnaseq -3\' \n";		
#print "RNA: 5\'- $rnaseq -3\' \n";

#print "enter a g for a letter grade or an s for a score: ";
#$type = <STDIN>;
#chomp $type;
#if($type eq 'g')
#{
#	print "your letter grade for CS412 is A";
#}
#elsif($type eq 's')
#{
#	print "your total score for CS412 is 95";
#}
#else
#{
#	print "please enter a valid input character."
#}

print "Enter a T for Template DNA input, type N for Non-Template DNA";
$type = <STDIN>;
chomp $type;
if($type eq 'T')
{
	print "Please enter the template strand of DNA.";
	$dnaseq = <STDIN>;
	chomp $dnaseq;
	$rnaseq = reverse($dnaseq);
	$rnaseq =~tr/ACGT/UGCA/;		
	print "DNA: 5\'- $dnaseq -3\' \n";		
	print "RNA: 5\'- $rnaseq -3\' \n";
}
elsif($type eq 'N')
{
	print "Please enter the non-template strand of DNA";
	$dnaseq = <STDIN>;
	chomp $dnaseq;
	$rnaseq = $dnaseq;		
	$rnaseq =~ s/T/U/g;		
	print "DNA: 5\'- $dnaseq -3\' \n";		
	print "RNA: 5\'- $rnaseq -3\' \n";
}
else
{
	print "That is not a valid option."
}