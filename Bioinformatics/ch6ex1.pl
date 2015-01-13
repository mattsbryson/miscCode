# Chapter 6 - Exercise 1
# This program will find the position of an ORF in a given sequence.
# The sequence will be read from an input file that follows FASTA format.
# The program will search in all three reading frames for a start codon of
# AUG and a stop codon of UAA, UAG, or UGA.  If the distance between the
# start and stop codons is >=60, the program will assume it has found an ORF.
# The program will print the start location, stop location and ORF sequence
# to an output file named output_ch6_ex1.txt.  This program will use
# subroutines to find the start and stop codon.


if(!open(infile, 'input.txt')){
    print "error opening input file\n";
    exit;
}
if(!open(outfile, '>output_ch6_ex1.txt')){
    print "error opening output file\n";
    exit;
}

$data = <infile>;   #ignore FASTA comment
while ($data = <infile>){
   chomp $data;
   $seq = $seq . $data;
}

# convert all Ts to Us
$seq =~ s/T/U/g;


$orfLength = 180;
$finalStop = 0;
$length = length($seq);
$notFound = 0;

print "Please enter the minimum length for an ORF: ";
$orfLength = <STDIN>;

while($length >= $finalStop + $orfLength)
{
	#print $length, " >= " ,$finalStop , "\n";
	# find ORF
	$found = 0;
	# set the starting position of the reading frame
	for($frame = $finalStop; ($frame < 3 + $finalStop) && ($found==0); $frame++){
		$frameSet = $finalStop;
	   $start = findStart($seq, $frame);
	   if (($start != -1) && ($start+$orfLength<=length($seq)-3)){
	     $stop = findStop($seq, $start);
	     if ($stop >= $start+$orfLength){
	     	 $finalStop = $stop;
	        $found = 1;
	        # printed assuming first position is 1
	        print outfile "ORF found in reading frame ",$frame+1 - $frameSet, " Start Loc: ", $start+1, " Stop Loc: ", $stop+1, "\n";
	        print outfile substr($seq, $start, $stop+3-$start), "\n";
	     }
	   }
	}
	if ($found == 0){
	 	$finalStop += $orfLength;
	}
}
	

sub findStart{
   my($seq, $start) = @_;
   for ($i=$start; $i<=length($seq)-3; $i+=3){
     if (substr($seq, $i, 3) eq "AUG" || substr($seq, $i, 3) eq "GUG" || substr($seq, $i, 3) eq "CUG" || substr($seq, $i, 3) eq "UUG"){
        return($i);
     }
   }
   return(-1);
}

sub findStop{
   my($seq, $start) = @_;
   for ($i=$start; $i<=length($seq)-3; $i+=3){
     if ((substr($seq, $i, 3) eq "UAA")
         || (substr($seq, $i, 3) eq "UAG")
         || (substr($seq, $i, 3) eq "UGA")){
        return($i);
     }
   }
   return(-1);
}
