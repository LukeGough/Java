package checksumwithreadwrite;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.zip.*;

public class ChecksumWithReadWrite {

    public static void main(String[] args) {
        try {
            String input = null;
            Path file = Paths.get("myfile.txt");
            Path checksumFile = Paths.get("checksum.txt");
            byte[] data = null;
            
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            OutputStream checksumOutput = new BufferedOutputStream(Files.newOutputStream(checksumFile, CREATE));
            //CheckedOutputStream cos = new CheckedOutputStream(output, new Adler32());
            Adler32 adler = new Adler32();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Input (\"x\" to exit): ");
            input = reader.readLine();

            while (!input.equals("x")) {
                data = input.getBytes();
                output.write(data);
                System.out.print("Input (\"x\" to exit): ");
                input = reader.readLine();
            }

            output.flush();
            output.close();

            //long checksumValue = cos.getChecksum().getValue();
            long checksumValue = adler.getValue();
            String checkSum = Long.toString(checksumValue);
            data = checkSum.getBytes();
            checksumOutput.write(data);

            System.out.println(checksumValue);
        } catch (IOException ioex) {
            System.out.println("IO Exception: " + ioex);
        }
    }
}
