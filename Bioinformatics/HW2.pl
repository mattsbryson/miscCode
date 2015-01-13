
#Question 3


print "Enter a T for Template DNA input, type N for Non-Template DNA: ";
$type = <STDIN>;
chomp $type;
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


if($type eq 'T')
{
	#print "Please enter the template strand of DNA.\n";
	#$dnaseq = <STDIN>;
	#chomp $dnaseq;
	$rnaseq = "";
	$rnaseq = $dnaseq ;
	$rnaseq =~tr/ACGT/UGCA/;		
	print "DNA: 5\'- $dnaseq -3\' \n";		
	print "RNA: 5\'- $rnaseq -3\' \n";
}
elsif($type eq 'N')
{
	#print "Please enter the non-template strand of DNA.\n";
	#$dnaseq = <STDIN>;
	#chomp $dnaseq;
	$rnaseq = $dnaseq;		
	$rnaseq =~ s/T/U/g;	
	print "DNA: 5\'- $dnaseq -3\' \n";		
	print "RNA: 5\'- $rnaseq -3\' \n";
}
else
{
	print "That is not a valid option."
}








#Question 6

my %codes;

$codes{'UUU'} = 'Phenylalanine ';
$codes{'UUC'} = 'Phenylalanine ';
$codes{'UUA'} = 'Leucine ';
$codes{'UUG'} = 'Leucine ';
$codes{'UCU'} = 'Serine ';
$codes{'UCC'} = 'Serine ';
$codes{'UCA'} = 'Serine ';
$codes{'UCG'} = 'Serine ';
$codes{'UAU'} = 'Tyrosine ';
$codes{'UAC'} = 'Tyrosine ';
$codes{'UGU'} = 'Cysteine ';
$codes{'UGC'} = 'Cysteine ';
$codes{'UGG'} = 'Tryptophan ';
$codes{'CUU'} = 'Leucine ';
$codes{'CUC'} = 'Leucine ';
$codes{'CUA'} = 'Leucine ';
$codes{'CUG'} = 'Leucine ';
$codes{'CCU'} = 'Proline ';
$codes{'CCC'} = 'Proline ';
$codes{'CCA'} = 'Proline ';
$codes{'CCG'} = 'Proline ';
$codes{'CAU'} = 'Histidine ';
$codes{'CAC'} = 'Histidine ';
$codes{'CAA'} = 'Glutamine ';
$codes{'CAG'} = 'Glitamine ';
$codes{'CGU'} = 'Arginine ';
$codes{'CGC'} = 'Arginine ';
$codes{'CGA'} = 'Arginine ';
$codes{'CGG'} = 'Arginine ';
$codes{'AUU'} = 'Isoleucine ';
$codes{'AUC'} = 'Isoleucine ';
$codes{'AUA'} = 'Isoleucine ';
$codes{'AUG'} = 'Methionine ';
$codes{'ACU'} = 'Threonine ';
$codes{'ACC'} = 'Threonine ';
$codes{'ACA'} = 'Threonine ';
$codes{'ACG'} = 'Threonine ';
$codes{'AAU'} = 'Asparagine ';
$codes{'AAC'} = 'Asparagine ';
$codes{'AAA'} = 'Lysine ';
$codes{'AAG'} = 'Lysine ';
$codes{'AGU'} = 'Serine ';
$codes{'AGC'} = 'Serine ';
$codes{'AGA'} = 'Arginine ';
$codes{'AGG'} = 'Arginine ';
$codes{'GUU'} = 'Valine ';
$codes{'GUC'} = 'Valine ';
$codes{'GUA'} = 'Valine ';
$codes{'GUG'} = 'Valine ';
$codes{'GCU'} = 'Alanine ';
$codes{'GCC'} = 'Alanine ';
$codes{'GCA'} = 'Alanine ';
$codes{'GCG'} = 'Alanine ';
$codes{'GAU'} = 'Aspartate ';
$codes{'GAC'} = 'Aspartate ';
$codes{'GAA'} = 'Glutamine ';
$codes{'GAG'} = 'Glutamine ';
$codes{'GGU'} = 'Glycine ';
$codes{'GGC'} = 'Glycine ';
$codes{'GGA'} = 'Glycine ';
$codes{'GGG'} = 'Glycine ';


print "Enter DNA sequence in capital letters: ";
$dnaseq=<STDIN>;
chomp $dnaseq;


$rnaseq = $dnaseq;		
$rnaseq =~ s/T/U/g;		
print "\nDNA: $dnaseq\n";		
print "RNA: $rnaseq\n\n";		


$codonctr = length($rnaseq) / 3;


print "Protein: ";
for($i = 0; $i < $codonctr; $i++){
	
   $aminoacid = $codes{substr($rnaseq, $i*3, 3)};
   print "$aminoacid";
}
print "\n";



my %codes2;

$codes2{'UUU'} = 'F';
$codes2{'UUC'} = 'F';
$codes2{'UUA'} = 'L';
$codes2{'UUG'} = 'L';
$codes2{'UCU'} = 'S';
$codes2{'UCC'} = 'S';
$codes2{'UCA'} = 'S';
$codes2{'UCG'} = 'S';
$codes2{'UAU'} = 'Y';
$codes2{'UAC'} = 'Y';
$codes2{'UGU'} = 'C';
$codes2{'UGC'} = 'C';
$codes2{'UGG'} = 'W';
$codes2{'CUU'} = 'L';
$codes2{'CUC'} = 'L';
$codes2{'CUA'} = 'L';
$codes2{'CUG'} = 'L';
$codes2{'CCU'} = 'P';
$codes2{'CCC'} = 'P';
$codes2{'CCA'} = 'P';
$codes2{'CCG'} = 'P';
$codes2{'CAU'} = 'H';
$codes2{'CAC'} = 'H';
$codes2{'CAA'} = 'Q';
$codes2{'CAG'} = 'Q';
$codes2{'CGU'} = 'R';
$codes2{'CGC'} = 'R';
$codes2{'CGA'} = 'R';
$codes2{'CGG'} = 'R';
$codes2{'AUU'} = 'I';
$codes2{'AUC'} = 'I';
$codes2{'AUA'} = 'I';
$codes2{'AUG'} = 'M';
$codes2{'ACU'} = 'T';
$codes2{'ACC'} = 'T';
$codes2{'ACA'} = 'T';
$codes2{'ACG'} = 'T';
$codes2{'AAU'} = 'N';
$codes2{'AAC'} = 'N';
$codes2{'AAA'} = 'K';
$codes2{'AAG'} = 'K';
$codes2{'AGU'} = 'S';
$codes2{'AGC'} = 'S';
$codes2{'AGA'} = 'R';
$codes2{'AGG'} = 'R';
$codes2{'GUU'} = 'V';
$codes2{'GUC'} = 'V';
$codes2{'GUA'} = 'V';
$codes2{'GUG'} = 'V';
$codes2{'GCU'} = 'A';
$codes2{'GCC'} = 'A';
$codes2{'GCA'} = 'A';
$codes2{'GCG'} = 'A';
$codes2{'GAU'} = 'D';
$codes2{'GAC'} = 'D';
$codes2{'GAA'} = 'Q';
$codes2{'GAG'} = 'Q';
$codes2{'GGU'} = 'G';
$codes2{'GGC'} = 'G';
$codes2{'GGA'} = 'G';
$codes2{'GGG'} = 'G';


print "Protein (One-letter): ";
for($i = 0; $i < $codonctr; $i++){

   $aminoacid = $codes2{substr($rnaseq, $i*3, 3)};
   print "$aminoacid";
}
print "\n";











#Question 8

# Chapter 2 - Exercise 2
# Translation Program

# The user will enter a non-template DNA strand in capital letters
# that represents a coding sequence consisting of nucleotides in
# multiples of three starting with ATG.  The program will print
# the input strand, its RNA and its amino acid equivalent.  It
# will use a hashtable to store the genetic codes.


print "Enter a T for Template DNA input, type N for Non-Template DNA: ";
$type = <STDIN>;
chomp $type;
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

$dnaseq =~tr/acgt/ACGT/;

if($type eq 'T')
{
	#print "Please enter the template strand of DNA.\n";
	#$dnaseq = <STDIN>;
	#chomp $dnaseq;
	$rnaseq = "";
	$rnaseq = $dnaseq ;
	$rnaseq =~tr/ACGT/UGCA/;		
}
elsif($type eq 'N')
{
	#print "Please enter the non-template strand of DNA.\n";
	#$dnaseq = <STDIN>;
	#chomp $dnaseq;
	$rnaseq = $dnaseq;		
	$rnaseq =~ s/T/U/g;	
}
else
{
	print "That is not a valid option."
}

		

# get number of codons
$codonctr = length($rnaseq) / 3;

# repeat translation process as many times as there are codons
print "Protein: ";
for($i = 0; $i < $codonctr; $i++){
   # call to hashtable
   $aminoacid = $codes{substr($rnaseq, $i*3, 3)};
   print "$aminoacid";
}
print "\n";


# statement may be needed to hold output screen
$x = "";
print "Press any key to exit program";
$x = <STDIN>;	





