/**
 * 
 */
package com.app.callout;

import java.awt.Color;

import javax.swing.JLabel;

/**
 * @author prashant.joshi
 *
 */
public class ThinkingRightCallout extends Callout {
	
	private static final long serialVersionUID = 1L;

	public ThinkingRightCallout(Color borderColor) {
		ThinkingRightCalloutBorder customBorder = new ThinkingRightCalloutBorder(borderColor, 15);
		this.setBorder(customBorder);
		this.setHorizontalTextPosition(JLabel.CENTER);
	    this.setVerticalTextPosition(JLabel.CENTER);
	}
	
	@Override
	public void setText(String text) {
		StringBuffer txtToPrint = new StringBuffer("<html>&nbsp;&nbsp;");
		String txtArr[] = text.split("<br>");
		for (String sText : txtArr) {
			String txt = wordWrap(sText, 40, "Right");
			txtToPrint.append(txt).append("<br>");
		}
		txtToPrint.append("</html>");
		System.out.println(txtToPrint.toString());
		super.setText(txtToPrint.toString());
	}

	@Override
	public void displayIcon() {
		// TODO Auto-generated method stub
		
	}
}
