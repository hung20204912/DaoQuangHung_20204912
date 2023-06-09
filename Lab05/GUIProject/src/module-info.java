module GUIProject {
	requires java.desktop;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires javafx.controls;
	opens hust.soict.dsai.javafx to javafx.graphics, javafx.fxml;
}