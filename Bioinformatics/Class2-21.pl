%codes = ();
$codes{'UUU'} = 'PHE';
$codes{'UUC'} = 'PHE';
$codes{'UUA'} = 'LEU';
$codes{'UUG'} = 'LEU';


$rnaseq = "";


print "Enter mRNA strand in captial letters: ";
$rnaseq = <STDIN>;
chomp $rnaseq;

#$i = 0;
#while(length($rnaseq) > $i)
#{
#	$codon = substr($rnaseq, $i, 3);
#	print $codes{$codon};
#	$i = $i + 3;
#}

# Chapter 2 - Exercise 2
# Translation Program

# The user will enter a non-template DNA strand in capital letters
# that represents a coding sequence consisting of nucleotides in
# multiples of three starting with ATG.  The program will print
# the input strand, its RNA and its amino acid equivalent.  It
# will use a hashtable to store the genetic codes.

# Build hashtable for genetic code
my %codes;
# Populate hashtable with values
$codes{'UUU'} = 'Phe';
$codes{'UUC'} = 'Phe';
$codes{'UUA'} = 'Leu';
$codes{'UUG'} = 'Leu';
$codes{'UCU'} = 'Ser';
$codes{'UCC'} = 'Ser';
$codes{'UCA'} = 'Ser';
$codes{'UCG'} = 'Ser';
$codes{'UAU'} = 'Tyr';
$codes{'UAC'} = 'Tyr';
$codes{'UGU'} = 'Cys';
$codes{'UGC'} = 'Cys';
$codes{'UGG'} = 'Trp';
$codes{'CUU'} = 'Leu';
$codes{'CUC'} = 'Leu';
$codes{'CUA'} = 'Leu';
$codes{'CUG'} = 'Leu';
$codes{'CCU'} = 'Pro';
$codes{'CCC'} = 'Pro';
$codes{'CCA'} = 'Pro';
$codes{'CCG'} = 'Pro';
$codes{'CAU'} = 'His';
$codes{'CAC'} = 'His';
$codes{'CAA'} = 'Gln';
$codes{'CAG'} = 'Gln';
$codes{'CGU'} = 'Arg';
$codes{'CGC'} = 'Arg';
$codes{'CGA'} = 'Arg';
$codes{'CGG'} = 'Arg';
$codes{'AUU'} = 'Ile';
$codes{'AUC'} = 'Ile';
$codes{'AUA'} = 'Ile';
$codes{'AUG'} = 'Met';
$codes{'ACU'} = 'Thr';
$codes{'ACC'} = 'Thr';
$codes{'ACA'} = 'Thr';
$codes{'ACG'} = 'Thr';
$codes{'AAU'} = 'Asn';
$codes{'AAC'} = 'Asn';
$codes{'AAA'} = 'Lys';
$codes{'AAG'} = 'Lys';
$codes{'AGU'} = 'Ser';
$codes{'AGC'} = 'Ser';
$codes{'AGA'} = 'Arg';
$codes{'AGG'} = 'Arg';
$codes{'GUU'} = 'Val';
$codes{'GUC'} = 'Val';
$codes{'GUA'} = 'Val';
$codes{'GUG'} = 'Val';
$codes{'GCU'} = 'Ala';
$codes{'GCC'} = 'Ala';
$codes{'GCA'} = 'Ala';
$codes{'GCG'} = 'Ala';
$codes{'GAU'} = 'Asp';
$codes{'GAC'} = 'Asp';
$codes{'GAA'} = 'Glu';
$codes{'GAG'} = 'Glu';
$codes{'GGU'} = 'Gly';
$codes{'GGC'} = 'Gly';
$codes{'GGA'} = 'Gly';
$codes{'GGG'} = 'Gly';



# Get non-template DNA sequence from user
print "Enter DNA sequence in capital letters: ";
$dnaseq=<STDIN>;
chomp $dnaseq;

# convert DNA to RNA
$rnaseq = $dnaseq;		
$rnaseq =~ s/T/U/g;		
print "DNA: $dnaseq\n";		
print "RNA: $rnaseq\n\n";		

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
print "Press any key to exit program";
$x = <STDIN>;	





