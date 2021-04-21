package io.github.jadefalke2;

import javax.swing.table.DefaultTableModel;

public class Function extends Script{

	public Function(String script) {
		super(script);
	}

	public void callFunction (DefaultTableModel table, Script mainScript, int row){



		for (int i = row; i < row + getInputLines().size(); i++){
			InputLine currentLineToInsert = getInputLines().get(i - row);
			currentLineToInsert.setLine(i);

			if (i > table.getRowCount()){
				mainScript.getInputLines().add(currentLineToInsert);
				table.addRow(currentLineToInsert.getArray());
			}else{

				for (int j = 0; j < table.getColumnCount(); j++){
					switch (j){

						case 1:
							mainScript.getInputLines().get(i).setStickL(getInputLines().get(i - row).getStickL());
							table.setValueAt(" ",i,j);
							break;

						case 2:
							// Stick R
							break;

						// buttons
					}
				}
			}
		}
	}


}