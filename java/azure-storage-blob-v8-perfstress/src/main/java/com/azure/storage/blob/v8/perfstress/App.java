package com.azure.storage.blob.v8.perfstress;

import com.azure.perfstress.PerfStressProgram;

public class App {
    public static void main(String[] args) {
        Class<?>[] testClasses;

        try {
            testClasses = new Class<?>[] {
                Class.forName("com.azure.storage.blob.v8.perfstress.DownloadTest"),
                Class.forName("com.azure.storage.blob.v8.perfstress.GetBlobsTest"),
            };
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        PerfStressProgram.Run(testClasses, args);
    }
}
