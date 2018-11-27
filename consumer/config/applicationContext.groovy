beans {
    'web_root'(String, java.io.File.separator.equals("/") ? "file:/xa-rdmp/user/program/www" : "file:/D:/xa/user/program/www")

    importBeans "file:**/applicationContext-**.groovy"
}