# Chapter 5 - Exercise 2
# Determine Overlap Program
# This program will determine the largest overlap between two fragments.  
#  The two fragments will be read from a single text file that follows 
#  FASTA format.  Each fragment will appear on its own input line.  The 
#  program will print the resulting overlapped fragment along with the 
#  number of overlapping characters to an output file named output_ch5_ex2.txt.


if(!open(infile, 'input.txt')){
    print "error opening input file 1\n";
    exit;
}

# assume each fragment appears on its own input line
$seq1 = <infile>;
chomp $seq1;
$seq2 = <infile>;
chomp $seq2;

if(!open(outfile, '>output_ch5_ex2.txt')){
    print "error opening output file \n";
    exit;
}

$seq1len = length($seq1);
$seq2len = length($seq2);
$n = $seq1len;
if ($seq1len > $seq2len){
   $n = $seq2len;
}

$done = 0;
for ($i=$n-1; $i>0 && $done==0; $i--){
  # compare suffix of first string with prefix of second
  if (substr($seq1, $seq1len-$i, $i) eq substr($seq2, 0, $i)){
     $done = 1;
     print outfile substr($seq1, 0, $seq1len-$i) . $seq2, " ", $i, "\n";
  }
  # else compare prefix of first string with suffix of second
  elsif (substr($seq2, $seq2len-$i, $i) eq substr($seq1, 0, $i)){
     $done = 1;
     print outfile substr($seq2, 0, $seq2len-$i) . $seq1, " ", $i, "\n";
  }
}
if ($done==0){
  print outfile "No overlap\n";
}
# statement may be needed to hold output screen
print "Press any key to exit program";
$x = <STDIN>;
