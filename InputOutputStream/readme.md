### Task
Use buffered input and output streams in the follow tasks when possible.

1. Using the Java class InputStream and OutputStream, wirte a program that takes a sequence of characters from the console replaces each whitespace character with the underscore '_' character and outputs the changed text to the screen.
2. Write a program that writes files and checksums and read them back as follows:
  * Write a Java program that takes lines of characters from the console and write them into a file. The input should stop when the read line contains a single x character only. The program should also calculate the checksum of the whole input and write it into a different file.
  * Write another program that reads a character file (e.g the file generated in the previous part of this question), printsits content to the screen and calculates the checksum of the file. The program should also read the checksum from another file and print it out to the screen (for comparison with the calculated value).
    
#### Hints:
  1. Look at CheckedOutputStream, CheckedInputStream
  2. For the checksum variable, use new Adler32() or new CRC32() in the constructor of the checked streams
  3. You need to flush the written output stream before you can access its checksum
