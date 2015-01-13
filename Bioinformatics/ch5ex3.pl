# Solution to Chapter 5 - Exercise 3

# This program uses a postprocessing technique to determine possible
# areas of misassembly.  The program will calculate the coverage value
# for each position in a sequence given the sequence, a set of fragments
# and each fragments starting location in the sequence.  The
# sequence, set of fragments and fragment positions will appear
# in single input file that follows FASTA format.  The sequence
# will appear on the first line of the file with the fragments following.
# Each fragment is preceded by its starting location in the file.
# The program will produce a count value for each base position and
# print this to an output file named output_ch5_ex3.txt.


if (!open(infile, 'input.txt')){
     print "error opening input file\n";
     exit;
}
if (!open(outfile, '>output_ch5_ex3.txt')){
     print "error opening output file\n";
     exit;
}

# The first item in the file is the consensus sequence.
# It is followed by a set of fragments, each of which is
# preceded by its starting location in the consensus
# sequence - assumes start position is 1.

# ###############################################################
# read in consensus sequence
# ###############################################################

$consensus = <infile>;
chomp $consensus;

# ###############################################################
# read in fragments and update counts
# ###############################################################

# create structure to hold base counts and initialize counts to 0
@basecount = ();
for ($i=0; $i<length($consensus); $i++){
   $basecount[$i] = 0;
}

# read in fragpos and fragment
# repeat process until no more data
while($temp = <infile>){
   chomp $temp;
   $fragpos = $temp-1;  # loc starts at 1 in input file
   $fragment = <infile>;
   chomp $fragment;
   for ($i=0; $i<length($fragment); $i++){
       $basecount[$i+$fragpos]++;
   }
}

for ($i=0; $i<@basecount; $i++){
   print outfile "base: ", $i, " count: ", $basecount[$i], "\n";
}


# statement may be needed to hold output screen
print "Press any key to exit program";
$x = <STDIN>;

