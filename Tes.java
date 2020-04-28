package com.hanshow;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * <p>Title: Tes</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: www.hanshow.com</p>
 *
 * @author guolin
 * @version 1.1
 * @date 2020-04-02 20:56
 */
public class Tes {
    public static void main(String[] args) {
        try {
            String command;
            command = "adb disconnect";
            Process exec = Runtime.getRuntime().exec(command);
            exec.waitFor();
            InputStream inputStream = exec.getInputStream();
            InputStreamReader inputReader = new InputStreamReader(inputStream);
            BufferedReader bf = new BufferedReader(inputReader);
            String content = bf.readLine();
            while (content != null) {
                System.out.println(content);
                content = bf.readLine();
            }
            bf.close();
            inputReader.close();
            inputStream.close();

            String ips = "192.168.20.207,192.168.20.49";
            ips = "192.168.20.49";
            String ipall[] = ips.split(",");
            for (int i = 0; i < ipall.length; i++) {
                command = "adb disconnect";
                //exec = Runtime.getRuntime().exec(new String[]{command,"adb kill-server","adb start-server","adb remount"});
                //exec = Runtime.getRuntime().exec(new String[]{command});
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                command = "adb connect ipaddress:5555".replaceAll("ipaddress",ipall[i]);
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                command = "adb push E:\\app\\set.txt sdcard";
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                if ("192.168.20.227".equals(ipall[i])) {
                    command = "adb install -r E:\\app\\DaemonService_54_v1.4.0_RC3_base.apk";
                } else {
                    command = "adb install -r E:\\app\\DaemonService_54_v1.4.0_RC3_base_hsp.apk";
                }
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                command = "adb install -r E:\\app\\DaemonService_54_v1.4.0_RC3_base_hsp.apk";
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                command = "adb install -r E:\\app\\LineScreen_57_v1.4.0RC4base.apk";
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                command = "adb install -r E:\\app\\SensorApp_3_v1.0.3on.apk";
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                command = "adb shell am start com.quick.screen/com.quick.screen.ui.MainActivity";
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                command = "adb shell am start com.hanshow.sensorapp/com.hanshow.sensorapp.MainActivity";
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();

                command = "adb reboot";
                exec = Runtime.getRuntime().exec(command);
                exec.waitFor();
                inputStream = exec.getInputStream();
                inputReader = new InputStreamReader(inputStream);
                bf = new BufferedReader(inputReader);
                content = bf.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = bf.readLine();
                }
                bf.close();
                inputReader.close();
                inputStream.close();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
