public void deleteFile() {
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    if (!someFile.delete()) {
        // Handle the case where to delete the file
    }
}
