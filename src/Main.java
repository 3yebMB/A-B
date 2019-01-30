import java.io.*;

public class Main {
    public static void main(String[] args) {
        String line;
        String result;
        String[] subStr = new String[2];

        try {
            FileInputStream fis = new FileInputStream("INPUT.TXT");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            try {
                line = br.readLine();
                subStr = line.split(" ");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            result = Integer.toString(Integer.parseInt(subStr[0]) + Integer.parseInt(subStr[1]));

            System.out.println(result);

            FileOutputStream fos = new FileOutputStream("OUTPUT.TXT");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            try {
                bw.write(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    bw.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
