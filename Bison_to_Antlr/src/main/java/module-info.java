/**
 *
 */
module Bison_to_Antlr {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.antlr.antlr4.runtime;

    opens org.openjfx to javafx.fxml;
    exports azer;
}