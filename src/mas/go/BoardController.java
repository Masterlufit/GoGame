package mas.go;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BoardController {
	Board board;
	String black = "black";
	String white = "white";

	@FXML
	Circle circle1_1;
	@FXML
	Circle circle1_2;
	@FXML
	Circle circle1_3;
	@FXML
	Circle circle1_4;
	@FXML
	Circle circle1_5;
	@FXML
	Circle circle1_6;
	@FXML
	Circle circle1_7;
	@FXML
	Circle circle1_8;
	@FXML
	Circle circle1_9;
	@FXML
	Circle circle1_10;
	@FXML
	Circle circle1_11;
	@FXML
	Circle circle1_12;
	@FXML
	Circle circle1_13;
	@FXML
	Circle circle1_14;
	@FXML
	Circle circle1_15;
	@FXML
	Circle circle1_16;
	@FXML
	Circle circle1_17;
	@FXML
	Circle circle1_18;
	@FXML
	Circle circle1_19;
	@FXML
	Circle circle2_1;
	@FXML
	Circle circle2_2;
	@FXML
	Circle circle2_3;
	@FXML
	Circle circle2_4;
	@FXML
	Circle circle2_5;
	@FXML
	Circle circle2_6;
	@FXML
	Circle circle2_7;
	@FXML
	Circle circle2_8;
	@FXML
	Circle circle2_9;
	@FXML
	Circle circle2_10;
	@FXML
	Circle circle2_11;
	@FXML
	Circle circle2_12;
	@FXML
	Circle circle2_13;
	@FXML
	Circle circle2_14;
	@FXML
	Circle circle2_15;
	@FXML
	Circle circle2_16;
	@FXML
	Circle circle2_17;
	@FXML
	Circle circle2_18;
	@FXML
	Circle circle2_19;
	@FXML
	Circle circle3_1;
	@FXML
	Circle circle3_2;
	@FXML
	Circle circle3_3;
	@FXML
	Circle circle3_4;
	@FXML
	Circle circle3_5;
	@FXML
	Circle circle3_6;
	@FXML
	Circle circle3_7;
	@FXML
	Circle circle3_8;
	@FXML
	Circle circle3_9;
	@FXML
	Circle circle3_10;
	@FXML
	Circle circle3_11;
	@FXML
	Circle circle3_12;
	@FXML
	Circle circle3_13;
	@FXML
	Circle circle3_14;
	@FXML
	Circle circle3_15;
	@FXML
	Circle circle3_16;
	@FXML
	Circle circle3_17;
	@FXML
	Circle circle3_18;
	@FXML
	Circle circle3_19;
	@FXML
	Circle circle4_1;
	@FXML
	Circle circle4_2;
	@FXML
	Circle circle4_3;
	@FXML
	Circle circle4_4;
	@FXML
	Circle circle4_5;
	@FXML
	Circle circle4_6;
	@FXML
	Circle circle4_7;
	@FXML
	Circle circle4_8;
	@FXML
	Circle circle4_9;
	@FXML
	Circle circle4_10;
	@FXML
	Circle circle4_11;
	@FXML
	Circle circle4_12;
	@FXML
	Circle circle4_13;
	@FXML
	Circle circle4_14;
	@FXML
	Circle circle4_15;
	@FXML
	Circle circle4_16;
	@FXML
	Circle circle4_17;
	@FXML
	Circle circle4_18;
	@FXML
	Circle circle4_19;
	@FXML
	Circle circle5_1;
	@FXML
	Circle circle5_2;
	@FXML
	Circle circle5_3;
	@FXML
	Circle circle5_4;
	@FXML
	Circle circle5_5;
	@FXML
	Circle circle5_6;
	@FXML
	Circle circle5_7;
	@FXML
	Circle circle5_8;
	@FXML
	Circle circle5_9;
	@FXML
	Circle circle5_10;
	@FXML
	Circle circle5_11;
	@FXML
	Circle circle5_12;
	@FXML
	Circle circle5_13;
	@FXML
	Circle circle5_14;
	@FXML
	Circle circle5_15;
	@FXML
	Circle circle5_16;
	@FXML
	Circle circle5_17;
	@FXML
	Circle circle5_18;
	@FXML
	Circle circle5_19;
	@FXML
	Circle circle6_1;
	@FXML
	Circle circle6_2;
	@FXML
	Circle circle6_3;
	@FXML
	Circle circle6_4;
	@FXML
	Circle circle6_5;
	@FXML
	Circle circle6_6;
	@FXML
	Circle circle6_7;
	@FXML
	Circle circle6_8;
	@FXML
	Circle circle6_9;
	@FXML
	Circle circle6_10;
	@FXML
	Circle circle6_11;
	@FXML
	Circle circle6_12;
	@FXML
	Circle circle6_13;
	@FXML
	Circle circle6_14;
	@FXML
	Circle circle6_15;
	@FXML
	Circle circle6_16;
	@FXML
	Circle circle6_17;
	@FXML
	Circle circle6_18;
	@FXML
	Circle circle6_19;
	@FXML
	Circle circle7_1;
	@FXML
	Circle circle7_2;
	@FXML
	Circle circle7_3;
	@FXML
	Circle circle7_4;
	@FXML
	Circle circle7_5;
	@FXML
	Circle circle7_6;
	@FXML
	Circle circle7_7;
	@FXML
	Circle circle7_8;
	@FXML
	Circle circle7_9;
	@FXML
	Circle circle7_10;
	@FXML
	Circle circle7_11;
	@FXML
	Circle circle7_12;
	@FXML
	Circle circle7_13;
	@FXML
	Circle circle7_14;
	@FXML
	Circle circle7_15;
	@FXML
	Circle circle7_16;
	@FXML
	Circle circle7_17;
	@FXML
	Circle circle7_18;
	@FXML
	Circle circle7_19;
	@FXML
	Circle circle8_1;
	@FXML
	Circle circle8_2;
	@FXML
	Circle circle8_3;
	@FXML
	Circle circle8_4;
	@FXML
	Circle circle8_5;
	@FXML
	Circle circle8_6;
	@FXML
	Circle circle8_7;
	@FXML
	Circle circle8_8;
	@FXML
	Circle circle8_9;
	@FXML
	Circle circle8_10;
	@FXML
	Circle circle8_11;
	@FXML
	Circle circle8_12;
	@FXML
	Circle circle8_13;
	@FXML
	Circle circle8_14;
	@FXML
	Circle circle8_15;
	@FXML
	Circle circle8_16;
	@FXML
	Circle circle8_17;
	@FXML
	Circle circle8_18;
	@FXML
	Circle circle8_19;
	@FXML
	Circle circle9_1;
	@FXML
	Circle circle9_2;
	@FXML
	Circle circle9_3;
	@FXML
	Circle circle9_4;
	@FXML
	Circle circle9_5;
	@FXML
	Circle circle9_6;
	@FXML
	Circle circle9_7;
	@FXML
	Circle circle9_8;
	@FXML
	Circle circle9_9;
	@FXML
	Circle circle9_10;
	@FXML
	Circle circle9_11;
	@FXML
	Circle circle9_12;
	@FXML
	Circle circle9_13;
	@FXML
	Circle circle9_14;
	@FXML
	Circle circle9_15;
	@FXML
	Circle circle9_16;
	@FXML
	Circle circle9_17;
	@FXML
	Circle circle9_18;
	@FXML
	Circle circle9_19;
	@FXML
	Circle circle10_1;
	@FXML
	Circle circle10_2;
	@FXML
	Circle circle10_3;
	@FXML
	Circle circle10_4;
	@FXML
	Circle circle10_5;
	@FXML
	Circle circle10_6;
	@FXML
	Circle circle10_7;
	@FXML
	Circle circle10_8;
	@FXML
	Circle circle10_9;
	@FXML
	Circle circle10_10;
	@FXML
	Circle circle10_11;
	@FXML
	Circle circle10_12;
	@FXML
	Circle circle10_13;
	@FXML
	Circle circle10_14;
	@FXML
	Circle circle10_15;
	@FXML
	Circle circle10_16;
	@FXML
	Circle circle10_17;
	@FXML
	Circle circle10_18;
	@FXML
	Circle circle10_19;
	@FXML
	Circle circle11_1;
	@FXML
	Circle circle11_2;
	@FXML
	Circle circle11_3;
	@FXML
	Circle circle11_4;
	@FXML
	Circle circle11_5;
	@FXML
	Circle circle11_6;
	@FXML
	Circle circle11_7;
	@FXML
	Circle circle11_8;
	@FXML
	Circle circle11_9;
	@FXML
	Circle circle11_10;
	@FXML
	Circle circle11_11;
	@FXML
	Circle circle11_12;
	@FXML
	Circle circle11_13;
	@FXML
	Circle circle11_14;
	@FXML
	Circle circle11_15;
	@FXML
	Circle circle11_16;
	@FXML
	Circle circle11_17;
	@FXML
	Circle circle11_18;
	@FXML
	Circle circle11_19;
	@FXML
	Circle circle12_1;
	@FXML
	Circle circle12_2;
	@FXML
	Circle circle12_3;
	@FXML
	Circle circle12_4;
	@FXML
	Circle circle12_5;
	@FXML
	Circle circle12_6;
	@FXML
	Circle circle12_7;
	@FXML
	Circle circle12_8;
	@FXML
	Circle circle12_9;
	@FXML
	Circle circle12_10;
	@FXML
	Circle circle12_11;
	@FXML
	Circle circle12_12;
	@FXML
	Circle circle12_13;
	@FXML
	Circle circle12_14;
	@FXML
	Circle circle12_15;
	@FXML
	Circle circle12_16;
	@FXML
	Circle circle12_17;
	@FXML
	Circle circle12_18;
	@FXML
	Circle circle12_19;
	@FXML
	Circle circle13_1;
	@FXML
	Circle circle13_2;
	@FXML
	Circle circle13_3;
	@FXML
	Circle circle13_4;
	@FXML
	Circle circle13_5;
	@FXML
	Circle circle13_6;
	@FXML
	Circle circle13_7;
	@FXML
	Circle circle13_8;
	@FXML
	Circle circle13_9;
	@FXML
	Circle circle13_10;
	@FXML
	Circle circle13_11;
	@FXML
	Circle circle13_12;
	@FXML
	Circle circle13_13;
	@FXML
	Circle circle13_14;
	@FXML
	Circle circle13_15;
	@FXML
	Circle circle13_16;
	@FXML
	Circle circle13_17;
	@FXML
	Circle circle13_18;
	@FXML
	Circle circle13_19;
	@FXML
	Circle circle14_1;
	@FXML
	Circle circle14_2;
	@FXML
	Circle circle14_3;
	@FXML
	Circle circle14_4;
	@FXML
	Circle circle14_5;
	@FXML
	Circle circle14_6;
	@FXML
	Circle circle14_7;
	@FXML
	Circle circle14_8;
	@FXML
	Circle circle14_9;
	@FXML
	Circle circle14_10;
	@FXML
	Circle circle14_11;
	@FXML
	Circle circle14_12;
	@FXML
	Circle circle14_13;
	@FXML
	Circle circle14_14;
	@FXML
	Circle circle14_15;
	@FXML
	Circle circle14_16;
	@FXML
	Circle circle14_17;
	@FXML
	Circle circle14_18;
	@FXML
	Circle circle14_19;
	@FXML
	Circle circle15_1;
	@FXML
	Circle circle15_2;
	@FXML
	Circle circle15_3;
	@FXML
	Circle circle15_4;
	@FXML
	Circle circle15_5;
	@FXML
	Circle circle15_6;
	@FXML
	Circle circle15_7;
	@FXML
	Circle circle15_8;
	@FXML
	Circle circle15_9;
	@FXML
	Circle circle15_10;
	@FXML
	Circle circle15_11;
	@FXML
	Circle circle15_12;
	@FXML
	Circle circle15_13;
	@FXML
	Circle circle15_14;
	@FXML
	Circle circle15_15;
	@FXML
	Circle circle15_16;
	@FXML
	Circle circle15_17;
	@FXML
	Circle circle15_18;
	@FXML
	Circle circle15_19;
	@FXML
	Circle circle16_1;
	@FXML
	Circle circle16_2;
	@FXML
	Circle circle16_3;
	@FXML
	Circle circle16_4;
	@FXML
	Circle circle16_5;
	@FXML
	Circle circle16_6;
	@FXML
	Circle circle16_7;
	@FXML
	Circle circle16_8;
	@FXML
	Circle circle16_9;
	@FXML
	Circle circle16_10;
	@FXML
	Circle circle16_11;
	@FXML
	Circle circle16_12;
	@FXML
	Circle circle16_13;
	@FXML
	Circle circle16_14;
	@FXML
	Circle circle16_15;
	@FXML
	Circle circle16_16;
	@FXML
	Circle circle16_17;
	@FXML
	Circle circle16_18;
	@FXML
	Circle circle16_19;
	@FXML
	Circle circle17_1;
	@FXML
	Circle circle17_2;
	@FXML
	Circle circle17_3;
	@FXML
	Circle circle17_4;
	@FXML
	Circle circle17_5;
	@FXML
	Circle circle17_6;
	@FXML
	Circle circle17_7;
	@FXML
	Circle circle17_8;
	@FXML
	Circle circle17_9;
	@FXML
	Circle circle17_10;
	@FXML
	Circle circle17_11;
	@FXML
	Circle circle17_12;
	@FXML
	Circle circle17_13;
	@FXML
	Circle circle17_14;
	@FXML
	Circle circle17_15;
	@FXML
	Circle circle17_16;
	@FXML
	Circle circle17_17;
	@FXML
	Circle circle17_18;
	@FXML
	Circle circle17_19;
	@FXML
	Circle circle18_1;
	@FXML
	Circle circle18_2;
	@FXML
	Circle circle18_3;
	@FXML
	Circle circle18_4;
	@FXML
	Circle circle18_5;
	@FXML
	Circle circle18_6;
	@FXML
	Circle circle18_7;
	@FXML
	Circle circle18_8;
	@FXML
	Circle circle18_9;
	@FXML
	Circle circle18_10;
	@FXML
	Circle circle18_11;
	@FXML
	Circle circle18_12;
	@FXML
	Circle circle18_13;
	@FXML
	Circle circle18_14;
	@FXML
	Circle circle18_15;
	@FXML
	Circle circle18_16;
	@FXML
	Circle circle18_17;
	@FXML
	Circle circle18_18;
	@FXML
	Circle circle18_19;
	@FXML
	Circle circle19_1;
	@FXML
	Circle circle19_2;
	@FXML
	Circle circle19_3;
	@FXML
	Circle circle19_4;
	@FXML
	Circle circle19_5;
	@FXML
	Circle circle19_6;
	@FXML
	Circle circle19_7;
	@FXML
	Circle circle19_8;
	@FXML
	Circle circle19_9;
	@FXML
	Circle circle19_10;
	@FXML
	Circle circle19_11;
	@FXML
	Circle circle19_12;
	@FXML
	Circle circle19_13;
	@FXML
	Circle circle19_14;
	@FXML
	Circle circle19_15;
	@FXML
	Circle circle19_16;
	@FXML
	Circle circle19_17;
	@FXML
	Circle circle19_18;
	@FXML
	Circle circle19_19;
	@FXML
	

	/**
	 * Initialize
	 */
	@FXML
	private void initialize() {
		board = MainApp.gameBoard;
	}

	/**
	 * Handler for each piece
	 */

	@FXML
	private void handle1_1() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 1, black)) {
				circle1_1.setOpacity(1);
				circle1_1.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 1, white)) {
				circle1_1.setOpacity(1);
				circle1_1.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_2() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 2, black)) {
				circle1_2.setOpacity(1);
				circle1_2.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 2, white)) {
				circle1_2.setOpacity(1);
				circle1_2.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_3() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 3, black)) {
				circle1_3.setOpacity(1);
				circle1_3.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 3, white)) {
				circle1_3.setOpacity(1);
				circle1_3.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_4() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 4, black)) {
				circle1_4.setOpacity(1);
				circle1_4.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 4, white)) {
				circle1_4.setOpacity(1);
				circle1_4.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_5() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 5, black)) {
				circle1_5.setOpacity(1);
				circle1_5.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 5, white)) {
				circle1_5.setOpacity(1);
				circle1_5.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_6() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 6, black)) {
				circle1_6.setOpacity(1);
				circle1_6.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 6, white)) {
				circle1_6.setOpacity(1);
				circle1_6.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_7() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 7, black)) {
				circle1_7.setOpacity(1);
				circle1_7.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 7, white)) {
				circle1_7.setOpacity(1);
				circle1_7.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_8() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 8, black)) {
				circle1_8.setOpacity(1);
				circle1_8.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 8, white)) {
				circle1_8.setOpacity(1);
				circle1_8.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_9() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 9, black)) {
				circle1_9.setOpacity(1);
				circle1_9.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 9, white)) {
				circle1_9.setOpacity(1);
				circle1_9.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_10() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 10, black)) {
				circle1_10.setOpacity(1);
				circle1_10.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 10, white)) {
				circle1_10.setOpacity(1);
				circle1_10.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_11() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 11, black)) {
				circle1_11.setOpacity(1);
				circle1_11.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 11, white)) {
				circle1_11.setOpacity(1);
				circle1_11.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_12() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 12, black)) {
				circle1_12.setOpacity(1);
				circle1_12.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 12, white)) {
				circle1_12.setOpacity(1);
				circle1_12.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_13() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 13, black)) {
				circle1_13.setOpacity(1);
				circle1_13.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 13, white)) {
				circle1_13.setOpacity(1);
				circle1_13.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_14() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 14, black)) {
				circle1_14.setOpacity(1);
				circle1_14.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 14, white)) {
				circle1_14.setOpacity(1);
				circle1_14.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_15() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 15, black)) {
				circle1_15.setOpacity(1);
				circle1_15.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 15, white)) {
				circle1_15.setOpacity(1);
				circle1_15.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_16() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 16, black)) {
				circle1_16.setOpacity(1);
				circle1_16.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 16, white)) {
				circle1_16.setOpacity(1);
				circle1_16.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_17() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 17, black)) {
				circle1_17.setOpacity(1);
				circle1_17.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 17, white)) {
				circle1_17.setOpacity(1);
				circle1_17.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_18() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 18, black)) {
				circle1_18.setOpacity(1);
				circle1_18.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 18, white)) {
				circle1_18.setOpacity(1);
				circle1_18.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle1_19() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(1, 19, black)) {
				circle1_19.setOpacity(1);
				circle1_19.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(1, 19, white)) {
				circle1_19.setOpacity(1);
				circle1_19.setFill(Color.WHITE);
			}
		}
	

	@FXML
	private void handle2_1() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 1, black)) {
				circle2_1.setOpacity(1);
				circle2_1.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 1, white)) {
				circle2_1.setOpacity(1);
				circle2_1.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_2() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 2, black)) {
				circle2_2.setOpacity(1);
				circle2_2.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 1, white)) {
				circle2_2.setOpacity(1);
				circle2_2.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_3() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 3, black)) {
				circle2_3.setOpacity(1);
				circle2_3.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 3, white)) {
				circle2_3.setOpacity(1);
				circle2_3.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_4() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 4, black)) {
				circle2_4.setOpacity(1);
				circle2_4.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 4, white)) {
				circle2_4.setOpacity(1);
				circle2_4.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_5() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 5, black)) {
				circle2_5.setOpacity(1);
				circle2_5.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 5, white)) {
				circle2_5.setOpacity(1);
				circle2_5.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_6() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 6, black)) {
				circle2_6.setOpacity(1);
				circle2_6.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 6, white)) {
				circle2_6.setOpacity(1);
				circle2_6.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_7() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 7, black)) {
				circle2_7.setOpacity(1);
				circle2_7.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 7, white)) {
				circle2_7.setOpacity(1);
				circle2_7.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_8() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 8, black)) {
				circle2_8.setOpacity(1);
				circle2_8.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 8, white)) {
				circle2_8.setOpacity(1);
				circle2_8.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_9() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 9, black)) {
				circle2_9.setOpacity(1);
				circle2_9.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 9, white)) {
				circle2_9.setOpacity(1);
				circle2_9.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_10() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 10, black)) {
				circle2_10.setOpacity(1);
				circle2_10.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 10, white)) {
				circle2_10.setOpacity(1);
				circle2_10.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_11() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 11, black)) {
				circle2_11.setOpacity(1);
				circle2_11.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 11, white)) {
				circle2_11.setOpacity(1);
				circle2_11.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_12() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 12, black)) {
				circle2_12.setOpacity(1);
				circle2_12.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 12, white)) {
				circle2_12.setOpacity(1);
				circle2_12.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_13() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 13, black)) {
				circle2_13.setOpacity(1);
				circle2_13.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 13, white)) {
				circle2_13.setOpacity(1);
				circle2_13.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_14() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 14, black)) {
				circle2_14.setOpacity(1);
				circle2_14.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 14, white)) {
				circle2_14.setOpacity(1);
				circle2_14.setFill(Color.WHITE);
			}
		}
	}	
	

	@FXML
	private void handle2_15() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 15, black)) {
				circle2_15.setOpacity(1);
				circle2_15.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 15, white)) {
				circle2_15.setOpacity(1);
				circle2_15.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_16() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 16, black)) {
				circle2_16.setOpacity(1);
				circle2_16.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 16, white)) {
				circle2_16.setOpacity(1);
				circle2_16.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_17() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 17, black)) {
				circle2_17.setOpacity(1);
				circle2_17.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 17, white)) {
				circle2_17.setOpacity(1);
				circle2_17.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_18() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 18, black)) {
				circle2_18.setOpacity(1);
				circle2_18.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 18, white)) {
				circle2_18.setOpacity(1);
				circle2_18.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle2_19() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(2, 19, black)) {
				circle2_19.setOpacity(1);
				circle2_19.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(2, 19, white)) {
				circle2_19.setOpacity(1);
				circle2_19.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_1() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 1, black)) {
				circle3_1.setOpacity(1);
				circle3_1.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 1, white)) {
				circle3_1.setOpacity(1);
				circle3_1.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_2() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 2, black)) {
				circle3_2.setOpacity(1);
				circle3_2.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 2, white)) {
				circle3_2.setOpacity(1);
				circle3_2.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_3() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 3, black)) {
				circle3_3.setOpacity(1);
				circle3_3.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 3, white)) {
				circle3_3.setOpacity(1);
				circle3_3.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_4() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 4, black)) {
				circle3_4.setOpacity(1);
				circle3_4.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 4, white)) {
				circle3_4.setOpacity(1);
				circle3_4.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_5() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 5, black)) {
				circle3_5.setOpacity(1);
				circle3_5.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 5, white)) {
				circle3_5.setOpacity(1);
				circle3_5.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_6() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 6, black)) {
				circle3_6.setOpacity(1);
				circle3_6.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 6, white)) {
				circle3_6.setOpacity(1);
				circle3_6.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_7() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 7, black)) {
				circle3_7.setOpacity(1);
				circle3_7.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 7, white)) {
				circle3_7.setOpacity(1);
				circle3_7.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_8() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 8, black)) {
				circle3_8.setOpacity(1);
				circle3_8.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 8, white)) {
				circle3_8.setOpacity(1);
				circle3_8.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_9() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 9, black)) {
				circle3_9.setOpacity(1);
				circle3_9.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 9, white)) {
				circle3_9.setOpacity(1);
				circle3_9.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_10() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 10, black)) {
				circle3_10.setOpacity(1);
				circle3_10.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 10, white)) {
				circle3_10.setOpacity(1);
				circle3_10.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_11() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 11, black)) {
				circle3_11.setOpacity(1);
				circle3_11.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 11, white)) {
				circle3_11.setOpacity(1);
				circle3_11.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_12() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 12, black)) {
				circle3_12.setOpacity(1);
				circle3_12.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 12, white)) {
				circle3_12.setOpacity(1);
				circle3_12.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_13() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 13, black)) {
				circle3_13.setOpacity(1);
				circle3_13.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 13, white)) {
				circle3_13.setOpacity(1);
				circle3_13.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_14() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 14, black)) {
				circle3_14.setOpacity(1);
				circle3_14.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 14, white)) {
				circle3_14.setOpacity(1);
				circle3_14.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_15() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 15, black)) {
				circle3_15.setOpacity(1);
				circle3_15.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 15, white)) {
				circle3_15.setOpacity(1);
				circle3_15.setFill(Color.WHITE);
			}
		}
	}
	@FXML
	private void handle3_16() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 16, black)) {
				circle3_16.setOpacity(1);
				circle3_16.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 16, white)) {
				circle3_16.setOpacity(1);
				circle3_16.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_17() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 17, black)) {
				circle3_17.setOpacity(1);
				circle3_17.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 17, white)) {
				circle3_17.setOpacity(1);
				circle3_17.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_18() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 18, black)) {
				circle3_18.setOpacity(1);
				circle3_18.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 18, white)) {
				circle3_18.setOpacity(1);
				circle3_18.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle3_19() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(3, 19, black)) {
				circle3_19.setOpacity(1);
				circle3_19.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(3, 19, white)) {
				circle3_19.setOpacity(1);
				circle3_19.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_1() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 1, black)) {
				circle4_1.setOpacity(1);
				circle4_1.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 1, white)) {
				circle4_1.setOpacity(1);
				circle4_1.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_2() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 2, black)) {
				circle4_2.setOpacity(1);
				circle4_2.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 2, white)) {
				circle4_2.setOpacity(1);
				circle4_2.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_3() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 3, black)) {
				circle4_3.setOpacity(1);
				circle4_3.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 3, white)) {
				circle4_3.setOpacity(1);
				circle4_3.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_4() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 4, black)) {
				circle4_4.setOpacity(1);
				circle4_4.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 4, white)) {
				circle4_4.setOpacity(1);
				circle4_4.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_5() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 5, black)) {
				circle4_5.setOpacity(1);
				circle4_5.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 5, white)) {
				circle4_5.setOpacity(1);
				circle4_5.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_6() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 6, black)) {
				circle4_6.setOpacity(1);
				circle4_6.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 6, white)) {
				circle4_6.setOpacity(1);
				circle4_6.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_7() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 7, black)) {
				circle4_7.setOpacity(1);
				circle4_7.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 7, white)) {
				circle4_7.setOpacity(1);
				circle4_7.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_8() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 8, black)) {
				circle4_8.setOpacity(1);
				circle4_8.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 8, white)) {
				circle4_8.setOpacity(1);
				circle4_8.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_9() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 9, black)) {
				circle4_9.setOpacity(1);
				circle4_9.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 9, white)) {
				circle4_9.setOpacity(1);
				circle4_9.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_10() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 10, black)) {
				circle4_10.setOpacity(1);
				circle4_10.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 10, white)) {
				circle4_10.setOpacity(1);
				circle4_10.setFill(Color.WHITE);
			}
		}
	}
	

	@FXML
	private void handle4_11() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 11, black)) {
				circle4_11.setOpacity(1);
				circle4_11.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 11, white)) {
				circle4_11.setOpacity(1);
				circle4_11.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_12() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 12, black)) {
				circle4_12.setOpacity(1);
				circle4_12.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 12, white)) {
				circle4_12.setOpacity(1);
				circle4_12.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_13() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 13, black)) {
				circle4_13.setOpacity(1);
				circle4_13.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 13, white)) {
				circle4_13.setOpacity(1);
				circle4_13.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_14() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 14, black)) {
				circle4_14.setOpacity(1);
				circle4_14.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 14, white)) {
				circle4_14.setOpacity(1);
				circle4_14.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_15() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 15, black)) {
				circle4_15.setOpacity(1);
				circle4_15.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 15, white)) {
				circle4_15.setOpacity(1);
				circle4_15.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_16() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 16, black)) {
				circle4_16.setOpacity(1);
				circle4_16.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 16, white)) {
				circle4_16.setOpacity(1);
				circle4_16.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_17() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 17, black)) {
				circle4_17.setOpacity(1);
				circle4_17.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 17, white)) {
				circle4_17.setOpacity(1);
				circle4_17.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_18() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 18, black)) {
				circle4_18.setOpacity(1);
				circle4_18.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 18, white)) {
				circle4_18.setOpacity(1);
				circle4_18.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle4_19() {
		if (board.getTurn().equals(black)) {
			if (board.nextController(4, 19, black)) {
				circle4_19.setOpacity(1);
				circle4_19.setFill(Color.BLACK);
			}
		} else {
			if (board.nextController(4, 19, white)) {
				circle4_19.setOpacity(1);
				circle4_19.setFill(Color.WHITE);
			}
		}
	}

	@FXML
	private void handle5_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 1, black);
		} else {
			board.nextController(5, 1, white);
		}
	}

	@FXML
	private void handle5_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 2, black);
		} else {
			board.nextController(5, 2, white);
		}
	}

	@FXML
	private void handle5_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 3, black);
		} else {
			board.nextController(5, 3, white);
		}
	}

	@FXML
	private void handle5_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 4, black);
		} else {
			board.nextController(5, 4, white);
		}
	}

	@FXML
	private void handle5_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 5, black);
		} else {
			board.nextController(5, 5, white);
		}
	}

	@FXML
	private void handle5_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 6, black);
		} else {
			board.nextController(5, 6, white);
		}
	}

	@FXML
	private void handle5_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 7, black);
		} else {
			board.nextController(5, 7, white);
		}
	}

	@FXML
	private void handle5_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 8, black);
		} else {
			board.nextController(5, 8, white);
		}
	}

	@FXML
	private void handle5_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 9, black);
		} else {
			board.nextController(5, 9, white);
		}
	}

	@FXML
	private void handle5_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 10, black);
		} else {
			board.nextController(5, 10, white);
		}
	}

	@FXML
	private void handle5_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 11, black);
		} else {
			board.nextController(5, 11, white);
		}
	}

	@FXML
	private void handle5_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 12, black);
		} else {
			board.nextController(5, 12, white);
		}
	}

	@FXML
	private void handle5_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 13, black);
		} else {
			board.nextController(5, 13, white);
		}
	}

	@FXML
	private void handle5_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 14, black);
		} else {
			board.nextController(5, 14, white);
		}
	}

	@FXML
	private void handle5_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 15, black);
		} else {
			board.nextController(5, 15, white);
		}
	}

	@FXML
	private void handle5_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 16, black);
		} else {
			board.nextController(5, 16, white);
		}
	}

	@FXML
	private void handle5_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 17, black);
		} else {
			board.nextController(5, 17, white);
		}
	}

	@FXML
	private void handle5_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 18, black);
		} else {
			board.nextController(5, 18, white);
		}
	}

	@FXML
	private void handle5_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(5, 19, black);
		} else {
			board.nextController(5, 19, white);
		}
	}

	@FXML
	private void handle6_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 1, black);
		} else {
			board.nextController(6, 1, white);
		}
	}

	@FXML
	private void handle6_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 2, black);
		} else {
			board.nextController(6, 2, white);
		}
	}

	@FXML
	private void handle6_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 3, black);
		} else {
			board.nextController(6, 3, white);
		}
	}

	@FXML
	private void handle6_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 4, black);
		} else {
			board.nextController(7, 4, white);
		}
	}

	@FXML
	private void handle6_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 5, black);
		} else {
			board.nextController(7, 5, white);
		}
	}

	@FXML
	private void handle6_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 6, black);
		} else {
			board.nextController(6, 6, white);
		}
	}

	@FXML
	private void handle6_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 7, black);
		} else {
			board.nextController(6, 7, white);
		}
	}

	@FXML
	private void handle6_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 8, black);
		} else {
			board.nextController(6, 8, white);
		}
	}

	@FXML
	private void handle6_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 9, black);
		} else {
			board.nextController(6, 9, white);
		}
	}

	@FXML
	private void handle6_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 10, black);
		} else {
			board.nextController(6, 10, white);
		}
	}

	@FXML
	private void handle6_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 11, black);
		} else {
			board.nextController(6, 11, white);
		}
	}

	@FXML
	private void handle6_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 12, black);
		} else {
			board.nextController(6, 12, white);
		}
	}

	@FXML
	private void handle6_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 13, black);
		} else {
			board.nextController(6, 13, white);
		}
	}

	@FXML
	private void handle6_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 14, black);
		} else {
			board.nextController(6, 14, white);
		}
	}

	@FXML
	private void handle6_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 15, black);
		} else {
			board.nextController(6, 15, white);
		}
	}

	@FXML
	private void handle6_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 16, black);
		} else {
			board.nextController(6, 16, white);
		}
	}

	@FXML
	private void handle6_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 17, black);
		} else {
			board.nextController(6, 17, white);
		}
	}

	@FXML
	private void handle6_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 18, black);
		} else {
			board.nextController(6, 18, white);
		}
	}

	@FXML
	private void handle6_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(6, 19, black);
		} else {
			board.nextController(6, 19, white);
		}
	}

	@FXML
	private void handle7_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 1, black);
		} else {
			board.nextController(7, 1, white);
		}
	}

	@FXML
	private void handle7_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 2, black);
		} else {
			board.nextController(7, 2, white);
		}
	}

	@FXML
	private void handle7_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 3, black);
		} else {
			board.nextController(7, 3, white);
		}
	}

	@FXML
	private void handle7_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 4, black);
		} else {
			board.nextController(7, 4, white);
		}
	}

	@FXML
	private void handle7_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 5, black);
		} else {
			board.nextController(7, 5, white);
		}
	}

	@FXML
	private void handle7_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 6, black);
		} else {
			board.nextController(7, 6, white);
		}
	}

	@FXML
	private void handle7_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 7, black);
		} else {
			board.nextController(7, 7, white);
		}
	}

	@FXML
	private void handle7_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 8, black);
		} else {
			board.nextController(7, 8, white);
		}
	}

	@FXML
	private void handle7_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 9, black);
		} else {
			board.nextController(7, 9, white);
		}
	}

	@FXML
	private void handle7_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 10, black);
		} else {
			board.nextController(7, 10, white);
		}
	}

	@FXML
	private void handle7_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 11, black);
		} else {
			board.nextController(7, 11, white);
		}
	}

	@FXML
	private void handle7_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 12, black);
		} else {
			board.nextController(7, 12, white);
		}
	}

	@FXML
	private void handle7_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 13, black);
		} else {
			board.nextController(7, 13, white);
		}
	}

	@FXML
	private void handle7_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 14, black);
		} else {
			board.nextController(7, 14, white);
		}
	}

	@FXML
	private void handle7_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 15, black);
		} else {
			board.nextController(7, 15, white);
		}
	}

	@FXML
	private void handle7_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 16, black);
		} else {
			board.nextController(7, 16, white);
		}
	}

	@FXML
	private void handle7_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 17, black);
		} else {
			board.nextController(7, 17, white);
		}
	}

	@FXML
	private void handle7_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 18, black);
		} else {
			board.nextController(7, 18, white);
		}
	}

	@FXML
	private void handle7_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(7, 19, black);
		} else {
			board.nextController(7, 19, white);
		}
	}

	@FXML
	private void handle8_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 1, black);
		} else {
			board.nextController(8, 1, white);
		}
	}

	@FXML
	private void handle8_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 2, black);
		} else {
			board.nextController(8, 2, white);
		}
	}

	@FXML
	private void handle8_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 3, black);
		} else {
			board.nextController(8, 3, white);
		}
	}

	@FXML
	private void handle8_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 4, black);
		} else {
			board.nextController(8, 4, white);
		}
	}

	@FXML
	private void handle8_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 5, black);
		} else {
			board.nextController(8, 5, white);
		}
	}

	@FXML
	private void handle8_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 6, black);
		} else {
			board.nextController(8, 6, white);
		}
	}

	@FXML
	private void handle8_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 7, black);
		} else {
			board.nextController(8, 7, white);
		}
	}

	@FXML
	private void handle8_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 8, black);
		} else {
			board.nextController(8, 8, white);
		}
	}

	@FXML
	private void handle8_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 9, black);
		} else {
			board.nextController(8, 9, white);
		}
	}

	@FXML
	private void handle8_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 10, black);
		} else {
			board.nextController(8, 10, white);
		}
	}

	@FXML
	private void handle8_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 11, black);
		} else {
			board.nextController(8, 11, white);
		}
	}

	@FXML
	private void handle8_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 12, black);
		} else {
			board.nextController(8, 12, white);
		}
	}

	@FXML
	private void handle8_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 13, black);
		} else {
			board.nextController(8, 13, white);
		}
	}

	@FXML
	private void handle8_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 14, black);
		} else {
			board.nextController(8, 14, white);
		}
	}

	@FXML
	private void handle8_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 15, black);
		} else {
			board.nextController(8, 15, white);
		}
	}

	@FXML
	private void handle8_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 16, black);
		} else {
			board.nextController(8, 16, white);
		}
	}

	@FXML
	private void handle8_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 17, black);
		} else {
			board.nextController(8, 17, white);
		}
	}

	@FXML
	private void handle8_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 18, black);
		} else {
			board.nextController(8, 18, white);
		}
	}

	@FXML
	private void handle8_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(8, 19, black);
		} else {
			board.nextController(8, 19, white);
		}
	}

	@FXML
	private void handle9_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 1, black);
		} else {
			board.nextController(9, 1, white);
		}
	}

	@FXML
	private void handle9_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 2, black);
		} else {
			board.nextController(9, 2, white);
		}
	}

	@FXML
	private void handle9_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 3, black);
		} else {
			board.nextController(9, 3, white);
		}
	}

	@FXML
	private void handle9_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 4, black);
		} else {
			board.nextController(9, 4, white);
		}
	}

	@FXML
	private void handle9_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 5, black);
		} else {
			board.nextController(9, 5, white);
		}
	}

	@FXML
	private void handle9_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 6, black);
		} else {
			board.nextController(9, 6, white);
		}
	}

	@FXML
	private void handle9_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 7, black);
		} else {
			board.nextController(9, 7, white);
		}
	}

	@FXML
	private void handle9_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 8, black);
		} else {
			board.nextController(9, 8, white);
		}
	}

	@FXML
	private void handle9_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 9, black);
		} else {
			board.nextController(9, 9, white);
		}
	}

	@FXML
	private void handle9_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 10, black);
		} else {
			board.nextController(9, 10, white);
		}
	}

	@FXML
	private void handle9_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 11, black);
		} else {
			board.nextController(9, 11, white);
		}
	}

	@FXML
	private void handle9_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 12, black);
		} else {
			board.nextController(9, 12, white);
		}
	}

	@FXML
	private void handle9_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 13, black);
		} else {
			board.nextController(9, 13, white);
		}
	}

	@FXML
	private void handle9_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 14, black);
		} else {
			board.nextController(9, 14, white);
		}
	}

	@FXML
	private void handle9_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 15, black);
		} else {
			board.nextController(9, 15, white);
		}
	}

	@FXML
	private void handle9_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 16, black);
		} else {
			board.nextController(9, 16, white);
		}
	}

	@FXML
	private void handle9_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 17, black);
		} else {
			board.nextController(9, 17, white);
		}
	}

	@FXML
	private void handle9_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 18, black);
		} else {
			board.nextController(9, 18, white);
		}
	}

	@FXML
	private void handle9_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(9, 19, black);
		} else {
			board.nextController(9, 19, white);
		}
	}

	@FXML
	private void handle10_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 1, black);
		} else {
			board.nextController(10, 1, white);
		}
	}

	@FXML
	private void handle10_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 2, black);
		} else {
			board.nextController(10, 2, white);
		}
	}

	@FXML
	private void handle10_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 3, black);
		} else {
			board.nextController(10, 3, white);
		}
	}

	@FXML
	private void handle10_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 4, black);
		} else {
			board.nextController(10, 4, white);
		}
	}

	@FXML
	private void handle10_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 5, black);
		} else {
			board.nextController(10, 5, white);
		}
	}

	@FXML
	private void handle10_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 6, black);
		} else {
			board.nextController(10, 6, white);
		}
	}

	@FXML
	private void handle10_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 7, black);
		} else {
			board.nextController(10, 7, white);
		}
	}

	@FXML
	private void handle10_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 8, black);
		} else {
			board.nextController(10, 8, white);
		}
	}

	@FXML
	private void handle10_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 9, black);
		} else {
			board.nextController(10, 9, white);
		}
	}

	@FXML
	private void handle10_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 10, black);
		} else {
			board.nextController(10, 10, white);
		}
	}

	@FXML
	private void handle10_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 11, black);
		} else {
			board.nextController(10, 11, white);
		}
	}

	@FXML
	private void handle10_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 12, black);
		} else {
			board.nextController(10, 12, white);
		}
	}

	@FXML
	private void handle10_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 13, black);
		} else {
			board.nextController(10, 13, white);
		}
	}

	@FXML
	private void handle10_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 14, black);
		} else {
			board.nextController(10, 14, white);
		}
	}

	@FXML
	private void handle10_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 15, black);
		} else {
			board.nextController(10, 15, white);
		}
	}

	@FXML
	private void handle10_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 16, black);
		} else {
			board.nextController(10, 16, white);
		}
	}

	@FXML
	private void handle10_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 17, black);
		} else {
			board.nextController(10, 17, white);
		}
	}

	@FXML
	private void handle10_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 18, black);
		} else {
			board.nextController(10, 18, white);
		}
	}

	@FXML
	private void handle10_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(10, 19, black);
		} else {
			board.nextController(10, 19, white);
		}
	}

	@FXML
	private void handle11_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 1, black);
		} else {
			board.nextController(11, 1, white);
		}
	}

	@FXML
	private void handle11_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 2, black);
		} else {
			board.nextController(11, 2, white);
		}
	}

	@FXML
	private void handle11_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 3, black);
		} else {
			board.nextController(11, 3, white);
		}
	}

	@FXML
	private void handle11_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 4, black);
		} else {
			board.nextController(11, 4, white);
		}
	}

	@FXML
	private void handle11_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 5, black);
		} else {
			board.nextController(11, 5, white);
		}
	}

	@FXML
	private void handle11_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 6, black);
		} else {
			board.nextController(11, 6, white);
		}
	}

	@FXML
	private void handle11_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 7, black);
		} else {
			board.nextController(11, 7, white);
		}
	}

	@FXML
	private void handle11_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 8, black);
		} else {
			board.nextController(11, 8, white);
		}
	}

	@FXML
	private void handle11_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 9, black);
		} else {
			board.nextController(11, 9, white);
		}
	}

	@FXML
	private void handle11_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 10, black);
		} else {
			board.nextController(11, 10, white);
		}
	}

	@FXML
	private void handle11_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 11, black);
		} else {
			board.nextController(11, 11, white);
		}
	}

	@FXML
	private void handle11_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 12, black);
		} else {
			board.nextController(11, 12, white);
		}
	}

	@FXML
	private void handle11_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 13, black);
		} else {
			board.nextController(11, 13, white);
		}
	}

	@FXML
	private void handle11_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 14, black);
		} else {
			board.nextController(11, 14, white);
		}
	}

	@FXML
	private void handle11_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 15, black);
		} else {
			board.nextController(11, 15, white);
		}
	}

	@FXML
	private void handle11_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 16, black);
		} else {
			board.nextController(11, 16, white);
		}
	}

	@FXML
	private void handle11_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 17, black);
		} else {
			board.nextController(11, 17, white);
		}
	}

	@FXML
	private void handle11_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 18, black);
		} else {
			board.nextController(11, 18, white);
		}
	}

	@FXML
	private void handle11_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(11, 19, black);
		} else {
			board.nextController(11, 19, white);
		}
	}

	@FXML
	private void handle12_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 1, black);
		} else {
			board.nextController(12, 1, white);
		}
	}

	@FXML
	private void handle12_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 2, black);
		} else {
			board.nextController(12, 2, white);
		}
	}

	@FXML
	private void handle12_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 3, black);
		} else {
			board.nextController(12, 3, white);
		}
	}

	@FXML
	private void handle12_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 4, black);
		} else {
			board.nextController(12, 4, white);
		}
	}

	@FXML
	private void handle12_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 5, black);
		} else {
			board.nextController(12, 5, white);
		}
	}

	@FXML
	private void handle12_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 6, black);
		} else {
			board.nextController(12, 6, white);
		}
	}

	@FXML
	private void handle12_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 7, black);
		} else {
			board.nextController(12, 7, white);
		}
	}

	@FXML
	private void handle12_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 8, black);
		} else {
			board.nextController(12, 8, white);
		}
	}

	@FXML
	private void handle12_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 9, black);
		} else {
			board.nextController(12, 9, white);
		}
	}

	@FXML
	private void handle12_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 10, black);
		} else {
			board.nextController(12, 10, white);
		}
	}

	@FXML
	private void handle12_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 11, black);
		} else {
			board.nextController(12, 11, white);
		}
	}

	@FXML
	private void handle12_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 12, black);
		} else {
			board.nextController(12, 12, white);
		}
	}

	@FXML
	private void handle12_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 13, black);
		} else {
			board.nextController(12, 13, white);
		}
	}

	@FXML
	private void handle12_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 14, black);
		} else {
			board.nextController(12, 14, white);
		}
	}

	@FXML
	private void handle12_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 15, black);
		} else {
			board.nextController(12, 15, white);
		}
	}

	@FXML
	private void handle12_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 16, black);
		} else {
			board.nextController(12, 16, white);
		}
	}

	@FXML
	private void handle12_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 17, black);
		} else {
			board.nextController(12, 17, white);
		}
	}

	@FXML
	private void handle12_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 18, black);
		} else {
			board.nextController(12, 18, white);
		}
	}

	@FXML
	private void handle12_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(12, 19, black);
		} else {
			board.nextController(12, 19, white);
		}
	}

	@FXML
	private void handle13_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 1, black);
		} else {
			board.nextController(13, 1, white);
		}
	}

	@FXML
	private void handle13_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 2, black);
		} else {
			board.nextController(13, 2, white);
		}
	}

	@FXML
	private void handle13_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 3, black);
		} else {
			board.nextController(13, 3, white);
		}
	}

	@FXML
	private void handle13_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 4, black);
		} else {
			board.nextController(13, 4, white);
		}
	}

	@FXML
	private void handle13_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 5, black);
		} else {
			board.nextController(13, 5, white);
		}
	}

	@FXML
	private void handle13_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 6, black);
		} else {
			board.nextController(13, 6, white);
		}
	}

	@FXML
	private void handle13_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 7, black);
		} else {
			board.nextController(13, 7, white);
		}
	}

	@FXML
	private void handle13_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 8, black);
		} else {
			board.nextController(13, 8, white);
		}
	}

	@FXML
	private void handle13_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 9, black);
		} else {
			board.nextController(13, 9, white);
		}
	}

	@FXML
	private void handle13_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 10, black);
		} else {
			board.nextController(13, 10, white);
		}
	}

	@FXML
	private void handle13_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 11, black);
		} else {
			board.nextController(13, 11, white);
		}
	}

	@FXML
	private void handle13_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 12, black);
		} else {
			board.nextController(13, 12, white);
		}
	}

	@FXML
	private void handle13_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 13, black);
		} else {
			board.nextController(13, 13, white);
		}
	}

	@FXML
	private void handle13_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 14, black);
		} else {
			board.nextController(13, 14, white);
		}
	}

	@FXML
	private void handle13_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 15, black);
		} else {
			board.nextController(13, 15, white);
		}
	}

	@FXML
	private void handle13_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 16, black);
		} else {
			board.nextController(13, 16, white);
		}
	}

	@FXML
	private void handle13_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 17, black);
		} else {
			board.nextController(13, 17, white);
		}
	}

	@FXML
	private void handle13_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 18, black);
		} else {
			board.nextController(13, 18, white);
		}
	}

	@FXML
	private void handle13_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(13, 19, black);
		} else {
			board.nextController(13, 19, white);
		}
	}

	@FXML
	private void handle14_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 1, black);
		} else {
			board.nextController(14, 1, white);
		}
	}

	@FXML
	private void handle14_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 2, black);
		} else {
			board.nextController(14, 2, white);
		}
	}

	@FXML
	private void handle14_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 3, black);
		} else {
			board.nextController(14, 3, white);
		}
	}

	@FXML
	private void handle14_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 4, black);
		} else {
			board.nextController(14, 4, white);
		}
	}

	@FXML
	private void handle14_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 5, black);
		} else {
			board.nextController(14, 5, white);
		}
	}

	@FXML
	private void handle14_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 6, black);
		} else {
			board.nextController(14, 6, white);
		}
	}

	@FXML
	private void handle14_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 7, black);
		} else {
			board.nextController(14, 7, white);
		}
	}

	@FXML
	private void handle14_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 8, black);
		} else {
			board.nextController(14, 8, white);
		}
	}

	@FXML
	private void handle14_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 9, black);
		} else {
			board.nextController(14, 9, white);
		}
	}

	@FXML
	private void handle14_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 10, black);
		} else {
			board.nextController(14, 10, white);
		}
	}

	@FXML
	private void handle14_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 11, black);
		} else {
			board.nextController(14, 11, white);
		}
	}

	@FXML
	private void handle14_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 12, black);
		} else {
			board.nextController(14, 12, white);
		}
	}

	@FXML
	private void handle14_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 13, black);
		} else {
			board.nextController(14, 13, white);
		}
	}

	@FXML
	private void handle14_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 14, black);
		} else {
			board.nextController(14, 14, white);
		}
	}

	@FXML
	private void handle14_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 15, black);
		} else {
			board.nextController(14, 15, white);
		}
	}

	@FXML
	private void handle14_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 16, black);
		} else {
			board.nextController(14, 16, white);
		}
	}

	@FXML
	private void handle14_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 17, black);
		} else {
			board.nextController(14, 17, white);
		}
	}

	@FXML
	private void handle14_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 18, black);
		} else {
			board.nextController(14, 18, white);
		}
	}

	@FXML
	private void handle14_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(14, 19, black);
		} else {
			board.nextController(14, 19, white);
		}
	}

	@FXML
	private void handle15_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 1, black);
		} else {
			board.nextController(15, 1, white);
		}
	}

	@FXML
	private void handle15_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 2, black);
		} else {
			board.nextController(15, 2, white);
		}
	}

	@FXML
	private void handle15_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 3, black);
		} else {
			board.nextController(15, 3, white);
		}
	}

	@FXML
	private void handle15_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 4, black);
		} else {
			board.nextController(15, 4, white);
		}
	}

	@FXML
	private void handle15_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 5, black);
		} else {
			board.nextController(15, 5, white);
		}
	}

	@FXML
	private void handle15_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 6, black);
		} else {
			board.nextController(15, 6, white);
		}
	}

	@FXML
	private void handle15_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 7, black);
		} else {
			board.nextController(15, 7, white);
		}
	}

	@FXML
	private void handle15_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 8, black);
		} else {
			board.nextController(15, 8, white);
		}
	}

	@FXML
	private void handle15_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 9, black);
		} else {
			board.nextController(15, 9, white);
		}
	}

	@FXML
	private void handle15_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 10, black);
		} else {
			board.nextController(15, 10, white);
		}
	}

	@FXML
	private void handle15_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 11, black);
		} else {
			board.nextController(15, 11, white);
		}
	}

	@FXML
	private void handle15_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 12, black);
		} else {
			board.nextController(15, 12, white);
		}
	}

	@FXML
	private void handle15_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 13, black);
		} else {
			board.nextController(15, 13, white);
		}
	}

	@FXML
	private void handle15_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 14, black);
		} else {
			board.nextController(15, 14, white);
		}
	}

	@FXML
	private void handle15_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 15, black);
		} else {
			board.nextController(15, 15, white);
		}
	}

	@FXML
	private void handle15_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 16, black);
		} else {
			board.nextController(15, 16, white);
		}
	}

	@FXML
	private void handle15_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 17, black);
		} else {
			board.nextController(15, 17, white);
		}
	}

	@FXML
	private void handle15_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 18, black);
		} else {
			board.nextController(15, 18, white);
		}
	}

	@FXML
	private void handle15_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(15, 19, black);
		} else {
			board.nextController(15, 19, white);
		}
	}

	@FXML
	private void handle16_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 1, black);
		} else {
			board.nextController(16, 1, white);
		}
	}

	@FXML
	private void handle16_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 2, black);
		} else {
			board.nextController(16, 2, white);
		}
	}

	@FXML
	private void handle16_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 3, black);
		} else {
			board.nextController(16, 3, white);
		}
	}

	@FXML
	private void handle16_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 4, black);
		} else {
			board.nextController(16, 4, white);
		}
	}

	@FXML
	private void handle16_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 5, black);
		} else {
			board.nextController(16, 5, white);
		}
	}

	@FXML
	private void handle16_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 6, black);
		} else {
			board.nextController(16, 6, white);
		}
	}

	@FXML
	private void handle16_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 7, black);
		} else {
			board.nextController(16, 7, white);
		}
	}

	@FXML
	private void handle16_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 8, black);
		} else {
			board.nextController(16, 8, white);
		}
	}

	@FXML
	private void handle16_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 9, black);
		} else {
			board.nextController(16, 9, white);
		}
	}

	@FXML
	private void handle16_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 10, black);
		} else {
			board.nextController(16, 10, white);
		}
	}

	@FXML
	private void handle16_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 11, black);
		} else {
			board.nextController(16, 11, white);
		}
	}

	@FXML
	private void handle16_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 12, black);
		} else {
			board.nextController(16, 12, white);
		}
	}

	@FXML
	private void handle16_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 13, black);
		} else {
			board.nextController(16, 13, white);
		}
	}

	@FXML
	private void handle16_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 14, black);
		} else {
			board.nextController(16, 14, white);
		}
	}

	@FXML
	private void handle16_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 15, black);
		} else {
			board.nextController(16, 15, white);
		}
	}

	@FXML
	private void handle16_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 16, black);
		} else {
			board.nextController(16, 16, white);
		}
	}

	@FXML
	private void handle16_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 17, black);
		} else {
			board.nextController(16, 17, white);
		}
	}

	@FXML
	private void handle16_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 18, black);
		} else {
			board.nextController(16, 18, white);
		}
	}

	@FXML
	private void handle16_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(16, 19, black);
		} else {
			board.nextController(16, 19, white);
		}
	}

	@FXML
	private void handle17_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 1, black);
		} else {
			board.nextController(17, 1, white);
		}
	}

	@FXML
	private void handle17_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 2, black);
		} else {
			board.nextController(17, 2, white);
		}
	}

	@FXML
	private void handle17_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 3, black);
		} else {
			board.nextController(17, 3, white);
		}
	}

	@FXML
	private void handle17_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 4, black);
		} else {
			board.nextController(17, 4, white);
		}
	}

	@FXML
	private void handle17_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 5, black);
		} else {
			board.nextController(17, 5, white);
		}
	}

	@FXML
	private void handle17_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 6, black);
		} else {
			board.nextController(17, 6, white);
		}
	}

	@FXML
	private void handle17_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 7, black);
		} else {
			board.nextController(17, 7, white);
		}
	}

	@FXML
	private void handle17_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 8, black);
		} else {
			board.nextController(17, 8, white);
		}
	}

	@FXML
	private void handle17_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 9, black);
		} else {
			board.nextController(17, 9, white);
		}
	}

	@FXML
	private void handle17_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 10, black);
		} else {
			board.nextController(17, 10, white);
		}
	}

	@FXML
	private void handle17_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 11, black);
		} else {
			board.nextController(17, 11, white);
		}
	}

	@FXML
	private void handle17_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 12, black);
		} else {
			board.nextController(17, 12, white);
		}
	}

	@FXML
	private void handle17_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 13, black);
		} else {
			board.nextController(17, 13, white);
		}
	}

	@FXML
	private void handle17_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 14, black);
		} else {
			board.nextController(17, 14, white);
		}
	}

	@FXML
	private void handle17_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 15, black);
		} else {
			board.nextController(17, 15, white);
		}
	}

	@FXML
	private void handle17_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 16, black);
		} else {
			board.nextController(17, 16, white);
		}
	}

	@FXML
	private void handle17_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 17, black);
		} else {
			board.nextController(17, 17, white);
		}
	}

	@FXML
	private void handle17_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 18, black);
		} else {
			board.nextController(17, 18, white);
		}
	}

	@FXML
	private void handle17_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(17, 19, black);
		} else {
			board.nextController(17, 19, white);
		}
	}

	@FXML
	private void handle18_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 1, black);
		} else {
			board.nextController(18, 1, white);
		}
	}

	@FXML
	private void handle18_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 2, black);
		} else {
			board.nextController(18, 2, white);
		}
	}

	@FXML
	private void handle18_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 3, black);
		} else {
			board.nextController(18, 3, white);
		}
	}

	@FXML
	private void handle18_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 4, black);
		} else {
			board.nextController(18, 4, white);
		}
	}

	@FXML
	private void handle18_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 5, black);
		} else {
			board.nextController(18, 5, white);
		}
	}

	@FXML
	private void handle18_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 6, black);
		} else {
			board.nextController(18, 6, white);
		}
	}

	@FXML
	private void handle18_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 7, black);
		} else {
			board.nextController(18, 7, white);
		}
	}

	@FXML
	private void handle18_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 8, black);
		} else {
			board.nextController(18, 8, white);
		}
	}

	@FXML
	private void handle18_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 9, black);
		} else {
			board.nextController(18, 9, white);
		}
	}

	@FXML
	private void handle18_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 10, black);
		} else {
			board.nextController(18, 10, white);
		}
	}

	@FXML
	private void handle18_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 11, black);
		} else {
			board.nextController(18, 11, white);
		}
	}

	@FXML
	private void handle18_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 12, black);
		} else {
			board.nextController(18, 12, white);
		}
	}

	@FXML
	private void handle18_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 13, black);
		} else {
			board.nextController(18, 13, white);
		}
	}

	@FXML
	private void handle18_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 14, black);
		} else {
			board.nextController(18, 14, white);
		}
	}

	@FXML
	private void handle18_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 15, black);
		} else {
			board.nextController(18, 15, white);
		}
	}

	@FXML
	private void handle18_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 16, black);
		} else {
			board.nextController(18, 16, white);
		}
	}

	@FXML
	private void handle18_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 17, black);
		} else {
			board.nextController(18, 17, white);
		}
	}

	@FXML
	private void handle18_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 18, black);
		} else {
			board.nextController(18, 18, white);
		}
	}

	@FXML
	private void handle18_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(18, 19, black);
		} else {
			board.nextController(18, 19, white);
		}
	}

	@FXML
	private void handle19_1() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 1, black);
		} else {
			board.nextController(19, 1, white);
		}
	}

	@FXML
	private void handle19_2() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 2, black);
		} else {
			board.nextController(19, 2, white);
		}
	}

	@FXML
	private void handle19_3() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 3, black);
		} else {
			board.nextController(19, 3, white);
		}
	}

	@FXML
	private void handle19_4() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 4, black);
		} else {
			board.nextController(19, 4, white);
		}
	}

	@FXML
	private void handle19_5() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 5, black);
		} else {
			board.nextController(19, 5, white);
		}
	}

	@FXML
	private void handle19_6() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 6, black);
		} else {
			board.nextController(19, 6, white);
		}
	}

	@FXML
	private void handle19_7() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 7, black);
		} else {
			board.nextController(19, 7, white);
		}
	}

	@FXML
	private void handle19_8() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 8, black);
		} else {
			board.nextController(19, 8, white);
		}
	}

	@FXML
	private void handle19_9() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 9, black);
		} else {
			board.nextController(19, 9, white);
		}
	}

	@FXML
	private void handle19_10() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 10, black);
		} else {
			board.nextController(19, 10, white);
		}
	}

	@FXML
	private void handle19_11() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 11, black);
		} else {
			board.nextController(19, 11, white);
		}
	}

	@FXML
	private void handle19_12() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 12, black);
		} else {
			board.nextController(19, 12, white);
		}
	}

	@FXML
	private void handle19_13() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 13, black);
		} else {
			board.nextController(19, 13, white);
		}
	}

	@FXML
	private void handle19_14() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 14, black);
		} else {
			board.nextController(19, 14, white);
		}
	}

	@FXML
	private void handle19_15() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 15, black);
		} else {
			board.nextController(19, 15, white);
		}
	}

	@FXML
	private void handle19_16() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 16, black);
		} else {
			board.nextController(19, 16, white);
		}
	}

	@FXML
	private void handle19_17() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 17, black);
		} else {
			board.nextController(19, 17, white);
		}
	}

	@FXML
	private void handle19_18() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 18, black);
		} else {
			board.nextController(19, 18, white);
		}
	}

	@FXML
	private void handle19_19() {
		if (board.getTurn().equals(black)) {
			board.nextController(19, 19, black);
		} else {
			board.nextController(19, 19, white);
		}
	}

}