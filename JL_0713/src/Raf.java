import java.io.IOException;
import java.io.RandomAccessFile;

class Raf {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("raf.txt", "rw");
//        int a = file.read();
//        System.out.println((char) a);
//
//        String s = file.readLine();
//        System.out.println(s);

//        file.seek(99);
//        String s2 = file.readLine();
//        System.out.println(s2);
//
//        long position = file.getFilePointer();
//        System.out.println(position);

        file.seek(0);
        file.writeBytes("@@@@");
        file.close();
    }
}