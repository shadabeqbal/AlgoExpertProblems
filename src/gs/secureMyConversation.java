package gs;

import java.io.*;

public class secureMyConversation {

    static String encryption(String message, String key){

        if(message == null || message.isEmpty() || message == " " || key == null || key == " ")
            return "-1";

        int m = 0;
        int k = 0;
        StringBuilder sb = new StringBuilder();
        while(k != key.length() && m != message.length()){
            int cnt = (key.charAt(k)-'1')+1;
            char ch = message.charAt(m);
            while(cnt != 0){
                sb.append(ch);
                cnt--;
            }
            k++;
            m++;
        }
        while(m != message.length()){
            sb.append(message.charAt(m));
            m++;
        }
        return sb.toString();
    }

    static String decryption(String message, String key){
        if(message == null || message.isEmpty() || message == " " || key == null || key == " ")
            return "-1";
        int m = 0;
        int k = 0;
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        while(k != key.length() && m != message.length()){
            int cnt = (int)key.charAt(k)-'1' + 1;
            counter+=cnt;
            char ch = message.charAt(counter - 1);
            sb.append(ch);
            k++;
            m = counter;
        }
        while(m != message.length()){
            sb.append(message.charAt(m));
            m++;
        }

        return sb.toString();
    }

    static String secureChannel(int operation, String message, String key) {
         if(operation == 1){
             return encryption(message, key);
         }else if(operation == 2){
             return decryption(message, key);
         }else{
             return "-1";
         }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int operation = Integer.parseInt(bufferedReader.readLine().trim());

        String message = bufferedReader.readLine();

        String key = bufferedReader.readLine();

        String res = secureChannel(operation, message, key);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
