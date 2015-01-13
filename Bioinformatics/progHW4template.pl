# Chapter 4 - Exercise 1
# This program implements the Needleman and Wunsch algorithm to align
# two protein sequences of varying length using hydrophobicity as
# mismatch scoring values.  The two sequences will be read in from
# separate input files that follow FASTA format.  The user will enter
# the match score, hydrophobicity match and mismatch scores, and gap
# scores.  The program will print the path, the alignment score and
# the alignment of the two input sequences to an output file named
# output_ch4_ex1.txt.


my($seq1, $len1, $seq2, $len2, $data, @matrix, $i, $j, $x, $y, $val1, $val2);
my($val3, $pathrow, $pathcol, $seq1loc, $seq2loc, $gapscore, $matchscore, $hmatch, $hmismatch);

if(!open(infile1, 'input1.txt')){
    print "error opening input file 1\n";
    exit;
}
$data = <infile1>;   #ignore FASTA comment
while ($data = <infile1>){
   chomp $data;
   $seq1 = $seq1 . $data;
}

if(!open(infile2, 'input2.txt')){
    print "error opening input file 2\n";
    exit;
}
$data = <infile2>;   #ignore FASTA comment
while ($data = <infile2>){
   chomp $data;
   $seq2 = $seq2 . $data;
}

if(!open(outfile, '>output_ch4_ex1.txt')){
    print "error opening output file 2\n";
    exit;
}

# create a hash variable and populate with values
# KLASSEN. I  entered hydrophobicity  values.
# KLASSEN. 0 strong hydrophobicity, 1 weak hydrophobicity, 3 weak hydrophobicity, 4 strong phobicity for simple program.
my %hydrovalues;
$hydrovalues{"D"} = 4;
$hydrovalues{"E"} = 4;
$hydrovalues{"K"} = 4;
$hydrovalues{"R"} = 4;
$hydrovalues{"H"} = 4;
$hydrovalues{"Y"} = 3;
$hydrovalues{"W"} = 3;
$hydrovalues{"F"} = 1;
$hydrovalues{"C"} = 1;
$hydrovalues{"M"} = 1;
$hydrovalues{"S"} = 3;
$hydrovalues{"T"} = 3;
$hydrovalues{"N"} = 4;
$hydrovalues{"Q"} = 4;
$hydrovalues{"G"} = 3;
$hydrovalues{"A"} = 1;
$hydrovalues{"V"} = 0;
$hydrovalues{"L"} = 0;
$hydrovalues{"I"} = 0;
$hydrovalues{"P"} = 3;
# adding extra characters so sequences align with matrix
# saves some calculations later on
$seq1 = " " . $seq1;
$seq2 = " " . $seq2;
$len1 = length($seq1);
$len2 = length($seq2);

print "Enter the match score: ";
$matchscore=<STDIN>;
chomp $matchscore;

print "Enter the good hydrophobicity match score: ";
$goodmatch=<STDIN>;
chomp $goodmatch;

print "Enter the weak hydrophobicity match score: ";
$weakmatch=<STDIN>;
chomp $weakmatch;

print "Enter the gap score: ";
$gapscore=<STDIN>;
chomp $gapscore;


# initialize 1st row and 1st column of matrix
$matrix[0][0] = 0;
for ($i = 1; $i < $len1; $i ++){
    $matrix[$i][0] = $matrix[$i-1][0] + $gapscore;
}
for ($i = 1; $i < $len2; $i ++){
    $matrix[0][$i] = $matrix[0][$i-1] + $gapscore;
}


# STEP 1:
# Fill in rest of matrix using the following rules:
# determine three possible values for matrix[x][y]
# value 1 = add gap score to matrix[x][y-1]
# value 2 = add gap score to matrix[x-1][y]
# value 3 = add match score or mismatch score to
#           matrix[x-1][y-1] depending on nucleotide
#           match for position x of $seq1 and position y
#           of seq2
# place the largest of the three values in matrix[x][y]
#
# Best alignment score appears in matrix[$len1][$len2].

for($x = 1; $x < $len1; $x++){
   for($y = 1; $y < $len2; $y++){
	$val1 = $matrix[$x][$y-1] + $gapscore;
	$val2 = $matrix[$x-1][$y] + $gapscore;
	if (substr($seq1, $x, 1) eq substr($seq2, $y, 1)){
           $val3 = $matrix[$x-1][$y-1] + $matchscore;
	}
	
	else{  
		#Matt & Carlos HW4
		
			if ((abs($hydrovalues{substr($seq1,$x,1)}-$hydrovalues{substr($seq2,$y,1)})<=1))
			{
				$val3=$matrix[$x-1][$y-1]+$goodmatch;
	
			}
			elsif ((abs($hydrovalues{substr($seq1,$x,1)}-$hydrovalues{substr($seq2,$y,1)})>1))
			{
				$val3=$matrix[$x-1][$y-1]+$weakscore;
			}

		}
		
		
		
		#KLASSEN:mismatch case divised into two cases: good hydrophobicity and weak hydrophobicity
		# KLASSEN.compare hydrophobicity values (absolute values using abs). if it is <=1, it is a good hydrophobicity. so add $goodmatch value
	    # KLASSEN.if it is  >1, it is a wek hydrophobicity, so add $weakmatch value.
	     # KLASEN.if else code goes in here. 
		}
	
	if (($val1 >= $val2) && ($val1 >= $val3)){
	   $matrix[$x][$y] = $val1;
	}
	elsif (($val2 >= $val1) && ($val2 >= $val3)){
	   $matrix[$x][$y] = $val2;
	}
	else{
	   $matrix[$x][$y] = $val3;
	}
   }

#Display scoring matrix
print outfile "MATRIX:\n";
for($x = 0; $x < $len1; $x++){
   for($y = 0; $y < $len2; $y++){
	print outfile "$matrix[$x][$y] ";
   }
   print outfile "\n";
}
print outfile "\n";

# STEP 2:
# Begin at matrix[$len1][$len2] and find a path to
# matrix[0][0].
# Build string to hold path pattern by concatenating either
# 'H' (current cell produced by cell horizontally to left),
# 'D' (current cell produced by cell on diagonal),
# 'V' (current cell produced by cell vertically above)
# It is possible for cell to have been produced by more
# than one of these possible choices, if multiple optimal
# alignments exist. For now, choose only one.
#
$pathrow = $len1-1;
$pathcol = $len2-1;
print outfile "alignment score: $matrix[$pathrow][$pathcol]\n";

while (($pathrow != 0) || ($pathcol != 0)){
    if ($pathrow == 0){
       # must be from cell to left
       $path = $path . 'H';
       $pathcol = $pathcol - 1;
    }
    elsif ($pathcol == 0){
       # must be from cell above
       $path = $path . 'V';
       $pathrow = $pathrow - 1;
    }
    # could be from any direction
    elsif  (($matrix[$pathrow][$pathcol-1] + $gapscore) == $matrix[$pathrow][$pathcol]){
       # from left
       $path = $path . 'H';
       $pathcol = $pathcol - 1;
    }
    elsif (($matrix[$pathrow-1][$pathcol] + $gapscore) == $matrix[$pathrow][$pathcol]){
       # from above
       $path = $path . 'V';
       $pathrow = $pathrow - 1;
    }
    else{
       # must be from diagonal
       $path = $path . 'D';
       $pathrow = $pathrow - 1;
       $pathcol = $pathcol - 1;
    }
}

# print "Path is $path\n";

# STEP 3:
# Determine alignment pattern by reading path string
# created in step 2.
# Create two string variables ($alignseq1 and $alignseq2) to hold
# the sequences for alignment.
# Reading backwards from $seq1, $seq2 and path string,
#   if string character is 'D', then
#      concatenate to front of $alignseq1, last char in $seq1
#      and to the front of $alignseq2, last char in $seq2
#   if string character is 'V', then
#      concatenate to front of $alignseq1, last char in $seq1
#      and to the front of $alignseq2, the gap char
#   if string character is 'H', then
#      concatenate to front of $alignseq1 the gap char
#      and to the front of $alignseq2, last char in $seq2
# Continue process until path string has been traversed.
# Result appears in string $alignseq1 and $seq2
#

$seq1loc = $len1-1;
$seq2loc = $len2-1;
$pathloc = 0;

while ($pathloc < length($path)){
   if (substr($path, $pathloc, 1) eq 'D'){
      $alignseq1 = substr($seq1, $seq1loc, 1) . $alignseq1;
      $alignseq2 = substr($seq2, $seq2loc, 1) . $alignseq2;
      $seq1loc--;
      $seq2loc--;
   }
   elsif (substr($path, $pathloc, 1) eq 'V'){
      $alignseq1 = substr($seq1, $seq1loc, 1) . $alignseq1;
      $alignseq2 = '-' . $alignseq2;
      $seq1loc--;
   }
   else{  # must be an H
      $alignseq1 = '-' . $alignseq1;
      $alignseq2 = substr($seq2, $seq2loc, 1) . $alignseq2;
      $seq2loc--;
   }
   $pathloc++;
}
print outfile "\nAligned Sequences:\n";
print outfile "$alignseq2 \n";
print outfile "$alignseq1 \n";

# statement may be needed to hold output screen
print "Press any key to exit program";
$x = <STDIN>;