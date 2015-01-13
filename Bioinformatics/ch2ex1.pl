# Chapter 2 - Exercise 1 
# Transcription Program 

# The user will enter a non-template DNA strand in capital letters
# and the program will print original DNA strand and its RNA equivalent.


print "Enter non-template DNA strand in capital letters: ";
$dnaseq = <STDIN>;
chomp $dnaseq;
$rnaseq = $dnaseq;		
$rnaseq =~ s/T/U/g;		
print "DNA: 5\'- $dnaseq -3\' \n";		
print "RNA: 5\'- $rnaseq -3\' \n";

# statement may be needed to hold output screen
print "Press any key to exit program";
$x = 0;
$x = <STDIN>;		
