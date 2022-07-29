module com.c57lee.nodedragresizerdemo {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.c57lee.nodedragresizerdemo to javafx.fxml;
    exports com.c57lee.nodedragresizerdemo;
}