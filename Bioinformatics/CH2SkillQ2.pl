print "Enter a T for Template DNA input, type N for Non-Template DNA: ";
$type = <STDIN>;
chomp $type;
if($type eq 'T')
{
	print "Please enter the template strand of DNA.\n";
	$dnaseq = <STDIN>;
	chomp $dnaseq;
	$rnaseq = "";
	$rnaseq = reverse( $dnaseq );
	$rnaseq =~tr/ACGT/UGCA/;		
	print "DNA: 5\'- $dnaseq -3\' \n";		
	print "RNA: 5\'- $rnaseq -3\' \n";
}
elsif($type eq 'N')
{
	print "Please enter the non-template strand of DNA.\n";
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