# Chapter 5 - Exercise 1
# Fragmenter Program
# This program will generate a random set of fragments
# given a sequence.  The sequence will be read from an
# input file that follows FASTA format.  The user will
# enter the minimum fragment length, maximum fragment length
# and fold coverage target.  The program will print the set
# of fragments along and each position's coverage value to an
# output file named output_ch5_ex1.txt.

if(!open(infile, 'input.txt')){
    print "error opening input file 1\n";
    exit;
}

my $seq;

while ($data = <infile>){
   chomp $data;
   $seq = $seq . $data;
}


if(!open(outfile, '>>output_ch5_ex1.txt')){
    print "error opening output file \n";
    exit;
}

print "Enter the minimum fragment size: ";
$minfrag=<STDIN>;
chomp $minfrag;

print "Enter the maximum fragment size: ";
$maxfrag=<STDIN>;
chomp $maxfrag;

print "Enter the fold coverage: ";
$fold=<STDIN>;
chomp $fold;

# seed the random number generator
srand(time|$$);

$seqlen = length($seq);

# initialize coverage array so it contains enough slots
# (needed when we check fold)
my @coverage;
for ($i=0; $i<$seqlen; $i++){
   $coverage[$i] = 0;
}

# randomly generate fragments
$ctr = 1;
$done = 0;
$loopCount = 0;
while ($done==0){
    # get a random length for the fragment
    # int(rand(x)) returns an integer number >= 0 and < x
    $rlength = int(rand($maxfrag-$minfrag+1));
    $rlength = $minfrag + $rlength;

    # get a random starting position in the sequence
    $rstart = int(rand($seqlen-$rlength+1));
    
    # get the fragment
    $fragment = substr($seq, $rstart, $rlength);

    print outfile "$fragment\n";
    $ctr++;
    
    # update coverage values for the fragments
    for ($i=$rstart; $i<$rstart+$rlength; $i++){
       $coverage[$i]++;
    }
    $done = 1;
    for ($i=0; $i<@coverage && $done==1; $i++){
       if ($coverage[$i] < $fold){
          $done = 0;
       }
    }
    $loopCount++;
}

for ($i=0; $i<@coverage; $i++){
   print outfile "coverage for ", $i, " is ", $coverage[$i], "\n";
}

print "Number of loop executions: " , $loopCount , "\n";
print "Number of fragments generated: " , $loopCount, "\n";

close (outfile);
# statement may be needed to hold output screen
print "Press any key to exit program";
$x = <STDIN>;
