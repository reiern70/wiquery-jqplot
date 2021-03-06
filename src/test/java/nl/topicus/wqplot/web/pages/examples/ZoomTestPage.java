package nl.topicus.wqplot.web.pages.examples;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.NumberSeries;
import nl.topicus.wqplot.data.StringNumberSeries;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PlotSeries;
import nl.topicus.wqplot.options.PlotTitle;
import nl.topicus.wqplot.options.PlotTooltipLocation;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.util.ListModel;

public class ZoomTestPage extends WebPage
{
	private static final long serialVersionUID = 1L;

	public ZoomTestPage()
	{
		addPlot1();
		addPlot2();
	}

	private void addPlot1()
	{
		StringNumberSeries<Double> l1 = new StringNumberSeries<Double>();
		l1.addEntry("6/22/2009", 425.32d);
		l1.addEntry("6/8/2009", 424.84d);
		l1.addEntry("5/26/2009", 417.23d);
		l1.addEntry("5/11/2009", 390d);
		l1.addEntry("4/27/2009", 393.69d);
		l1.addEntry("4/13/2009", 392.24d);
		l1.addEntry("3/30/2009", 369.78d);
		l1.addEntry("3/16/2009", 330.16d);
		l1.addEntry("3/2/2009", 308.57d);
		l1.addEntry("2/17/2009", 346.45d);
		l1.addEntry("2/2/2009", 371.28d);
		l1.addEntry("1/20/2009", 324.7d);
		l1.addEntry("1/5/2009", 315.07d);
		l1.addEntry("12/22/2008", 300.36d);
		l1.addEntry("12/8/2008", 315.76d);
		l1.addEntry("11/24/2008", 292.96d);
		l1.addEntry("11/10/2008", 310.02d);
		l1.addEntry("10/27/2008", 359.36d);
		l1.addEntry("10/13/2008", 372.54d);
		l1.addEntry("9/29/2008", 386.91d);
		l1.addEntry("9/15/2008", 449.15d);
		l1.addEntry("9/2/2008", 444.25d);
		l1.addEntry("8/25/2008", 463.29d);
		l1.addEntry("8/11/2008", 510.15d);
		l1.addEntry("7/28/2008", 467.86d);
		l1.addEntry("7/14/2008", 481.32d);
		l1.addEntry("6/30/2008", 537d);
		l1.addEntry("6/16/2008", 546.43d);
		l1.addEntry("6/2/2008", 567d);
		l1.addEntry("5/19/2008", 544.62d);
		l1.addEntry("5/5/2008", 573.2d);
		l1.addEntry("4/21/2008", 544.06d);
		l1.addEntry("4/7/2008", 457.45d);
		l1.addEntry("3/24/2008", 438.08d);
		l1.addEntry("3/10/2008", 437.92d);
		l1.addEntry("2/25/2008", 471.18d);
		l1.addEntry("2/11/2008", 529.64d);
		l1.addEntry("1/28/2008", 515.9d);
		l1.addEntry("1/14/2008", 600.25d);
		l1.addEntry("12/31/2007", 657d);
		l1.addEntry("12/17/2007", 696.69d);
		l1.addEntry("12/3/2007", 714.87d);
		l1.addEntry("11/19/2007", 676.7d);
		l1.addEntry("11/5/2007", 663.97d);
		l1.addEntry("10/22/2007", 674.6d);
		l1.addEntry("10/8/2007", 637.39d);
		l1.addEntry("9/24/2007", 567.27d);
		l1.addEntry("9/10/2007", 528.75d);
		l1.addEntry("8/27/2007", 515.25d);

		@SuppressWarnings("unchecked")
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<StringNumberSeries<Double>>(Arrays.asList(l1)));
		PlotOptions chart1O = chart1.getOptions();
		chart1O.setTitle("Google, Inc.");

		Button button = new Button("button1");
		button.add(new AttributeModifier("onclick", true, new Model<String>(chart1.getMarkupId()
			+ ".resetZoom()")));
		add(button);

		PlotSeries chart1series1 = chart1O.addNewSeries();
		chart1series1.setLabel("Google, Inc.");
		chart1series1.setNeighborThreshold(-1d);

		chart1O.getAxes().getXaxis().setRenderer("$.jqplot.DateAxisRenderer");
		chart1O.getAxes().getXaxis().setMin("August 1, 2007");
		chart1O.getAxes().getXaxis().setTickInterval("4 months");
		chart1O.getAxes().getXaxis().getTickOptions().setFormatString("%Y/%#m/%#d");
		chart1O.getAxes().getYaxis().setRenderer("$.jqplot.LogAxisRenderer");
		chart1O.getAxes().getYaxis().getTickOptions().setFormatString("$%.2f");

		chart1O.getCursor().setShow(true);
		chart1O.getCursor().setZoom(true);
		chart1O.getCursor().setShowTooltip(true);
		add(chart1);
	}

	private void addPlot2()
	{
		NumberSeries<Double, Double> l1 = new NumberSeries<Double, Double>();
		l1.addEntry(0.0, 85.0);
		l1.addEntry(10.0, 87.4);
		l1.addEntry(20.0, 90.0);
		l1.addEntry(30.0, 91.3);
		l1.addEntry(40.0, 93.5);
		l1.addEntry(50.0, 94.1);
		l1.addEntry(60.0, 95.4);
		l1.addEntry(70.0, 95.8);
		l1.addEntry(80.0, 96.1);
		l1.addEntry(90.0, 97.6);
		l1.addEntry(100.0, 97.4);
		l1.addEntry(110.0, 97.7);
		l1.addEntry(120.0, 97.9);
		l1.addEntry(130.0, 98.3);
		l1.addEntry(140.0, 97.9);
		l1.addEntry(150.0, 98.4);
		l1.addEntry(160.0, 99.8);
		l1.addEntry(170.0, 100.5);
		l1.addEntry(180.0, 100.4);
		l1.addEntry(190.0, 100.3);
		l1.addEntry(200.0, 102.9);
		l1.addEntry(210.0, 104.1);
		l1.addEntry(220.0, 104.4);
		l1.addEntry(230.0, 103.9);
		l1.addEntry(240.0, 104.4);
		l1.addEntry(250.0, 104.0);
		l1.addEntry(260.0, 103.9);
		l1.addEntry(270.0, 103.5);
		l1.addEntry(280.0, 105.4);
		l1.addEntry(290.0, 105.7);
		l1.addEntry(300.0, 105.7);
		l1.addEntry(310.0, 105.3);
		l1.addEntry(320.0, 105.0);
		l1.addEntry(330.0, 105.1);
		l1.addEntry(340.0, 105.0);
		l1.addEntry(350.0, 105.1);
		l1.addEntry(360.0, 104.7);
		l1.addEntry(370.0, 104.4);
		l1.addEntry(380.0, 104.3);
		l1.addEntry(390.0, 105.7);
		l1.addEntry(400.0, 106.4);
		l1.addEntry(410.0, 105.7);
		l1.addEntry(420.0, 105.4);
		l1.addEntry(430.0, 105.7);
		l1.addEntry(440.0, 105.7);
		l1.addEntry(450.0, 105.9);
		l1.addEntry(460.0, 105.3);
		l1.addEntry(470.0, 105.7);
		l1.addEntry(480.0, 105.8);
		l1.addEntry(490.0, 105.4);
		l1.addEntry(500.0, 105.4);
		l1.addEntry(510.0, 105.4);
		l1.addEntry(520.0, 105.6);
		l1.addEntry(530.0, 104.9);
		l1.addEntry(540.0, 104.8);
		l1.addEntry(550.0, 105.2);
		l1.addEntry(560.0, 105.2);
		l1.addEntry(570.0, 105.1);
		l1.addEntry(580.0, 104.8);
		l1.addEntry(590.0, 104.6);
		l1.addEntry(600.0, 104.3);
		l1.addEntry(610.0, 104.2);
		l1.addEntry(620.0, 104.1);
		l1.addEntry(630.0, 104.7);
		l1.addEntry(640.0, 104.6);
		l1.addEntry(650.0, 104.7);
		l1.addEntry(660.0, 104.6);
		l1.addEntry(670.0, 104.4);
		l1.addEntry(680.0, 106.8);
		l1.addEntry(690.0, 106.6);
		l1.addEntry(700.0, 106.3);
		l1.addEntry(710.0, 107.1);
		l1.addEntry(720.0, 106.2);
		l1.addEntry(730.0, 106.1);
		l1.addEntry(740.0, 106.7);
		l1.addEntry(750.0, 106.5);
		l1.addEntry(760.0, 106.8);
		l1.addEntry(770.0, 106.7);
		l1.addEntry(780.0, 106.6);
		l1.addEntry(790.0, 106.7);
		l1.addEntry(800.0, 106.8);
		l1.addEntry(810.0, 106.4);
		l1.addEntry(820.0, 106.7);
		l1.addEntry(830.0, 106.5);
		l1.addEntry(840.0, 106.9);
		l1.addEntry(850.0, 106.7);
		l1.addEntry(860.0, 106.7);
		l1.addEntry(870.0, 106.8);
		l1.addEntry(880.0, 107.1);
		l1.addEntry(890.0, 106.6);
		l1.addEntry(900.0, 106.8);
		l1.addEntry(910.0, 106.9);
		l1.addEntry(920.0, 106.8);
		l1.addEntry(930.0, 107.3);
		l1.addEntry(940.0, 106.9);
		l1.addEntry(950.0, 106.5);
		l1.addEntry(960.0, 107.2);
		l1.addEntry(970.0, 107.0);
		l1.addEntry(980.0, 106.9);
		l1.addEntry(990.0, 107.2);
		l1.addEntry(1000.0, 107.7);
		l1.addEntry(1010.0, 107.6);
		l1.addEntry(1020.0, 107.1);
		l1.addEntry(1030.0, 107.6);
		l1.addEntry(1040.0, 107.2);
		l1.addEntry(1050.0, 107.2);
		l1.addEntry(1060.0, 107.5);
		l1.addEntry(1070.0, 107.7);
		l1.addEntry(1080.0, 107.3);
		l1.addEntry(1090.0, 107.0);
		l1.addEntry(1100.0, 107.7);
		l1.addEntry(1110.0, 107.0);
		l1.addEntry(1120.0, 107.8);
		l1.addEntry(1130.0, 107.8);
		l1.addEntry(1140.0, 107.7);
		l1.addEntry(1150.0, 107.4);
		l1.addEntry(1160.0, 107.8);
		l1.addEntry(1170.0, 107.8);
		l1.addEntry(1180.0, 107.6);
		l1.addEntry(1190.0, 107.7);
		l1.addEntry(1200.0, 107.4);
		l1.addEntry(1210.0, 108.0);
		l1.addEntry(1220.0, 372.6);
		l1.addEntry(1230.0, 90.4);
		l1.addEntry(1240.0, 125.0);
		l1.addEntry(1250.0, 110.4);
		l1.addEntry(1260.0, 108.5);
		l1.addEntry(1270.0, 109.7);
		l1.addEntry(1280.0, 108.9);
		l1.addEntry(1290.0, 109.6);
		l1.addEntry(1300.0, 110.2);
		l1.addEntry(1310.0, 110.0);
		l1.addEntry(1320.0, 110.7);
		l1.addEntry(1330.0, 110.3);
		l1.addEntry(1340.0, 110.6);
		l1.addEntry(1350.0, 110.5);
		l1.addEntry(1360.0, 110.8);
		l1.addEntry(1370.0, 110.6);
		l1.addEntry(1380.0, 111.0);
		l1.addEntry(1390.0, 113.0);
		l1.addEntry(1400.0, 112.1);
		l1.addEntry(1410.0, 112.3);
		l1.addEntry(1420.0, 112.3);
		l1.addEntry(1430.0, 137.6);
		l1.addEntry(1440.0, 179.0);
		l1.addEntry(1450.0, 216.9);
		l1.addEntry(1460.0, 399.2);
		l1.addEntry(1470.0, 433.6);
		l1.addEntry(1480.0, 203.5);
		l1.addEntry(1490.0, 223.3);
		l1.addEntry(1500.0, 229.8);
		l1.addEntry(1510.0, 416.9);
		l1.addEntry(1520.0, 198.8);
		l1.addEntry(1530.0, 208.7);
		l1.addEntry(1540.0, 172.0);
		l1.addEntry(1550.0, 145.7);
		l1.addEntry(1560.0, 119.2);
		l1.addEntry(1570.0, 104.8);
		l1.addEntry(1580.0, 100.1);
		l1.addEntry(1590.0, 97.7);
		l1.addEntry(1600.0, 97.2);
		l1.addEntry(1610.0, 98.8);
		l1.addEntry(1620.0, 98.1);
		l1.addEntry(1630.0, 98.1);
		l1.addEntry(1640.0, 98.8);
		l1.addEntry(1650.0, 98.7);
		l1.addEntry(1660.0, 98.5);
		l1.addEntry(1670.0, 98.8);
		l1.addEntry(1680.0, 98.2);
		l1.addEntry(1690.0, 98.2);
		l1.addEntry(1700.0, 97.7);
		l1.addEntry(1710.0, 98.1);
		l1.addEntry(1720.0, 97.1);
		l1.addEntry(1730.0, 97.6);
		l1.addEntry(1740.0, 97.7);
		l1.addEntry(1750.0, 97.4);
		l1.addEntry(1760.0, 97.6);
		l1.addEntry(1770.0, 98.0);
		l1.addEntry(1780.0, 97.6);
		l1.addEntry(1790.0, 97.7);
		l1.addEntry(1800.0, 97.8);
		l1.addEntry(1810.0, 97.6);
		l1.addEntry(1820.0, 97.9);
		l1.addEntry(1830.0, 97.9);
		l1.addEntry(1840.0, 97.8);
		l1.addEntry(1850.0, 97.7);
		l1.addEntry(1860.0, 97.7);
		l1.addEntry(1870.0, 97.7);
		l1.addEntry(1880.0, 97.4);
		l1.addEntry(1890.0, 97.3);
		l1.addEntry(1900.0, 97.2);
		l1.addEntry(1910.0, 96.9);
		l1.addEntry(1920.0, 97.2);
		l1.addEntry(1930.0, 97.4);
		l1.addEntry(1940.0, 97.7);
		l1.addEntry(1950.0, 97.1);
		l1.addEntry(1960.0, 97.1);
		l1.addEntry(1970.0, 96.6);
		l1.addEntry(1980.0, 96.7);
		l1.addEntry(1990.0, 96.5);
		l1.addEntry(2000.0, 97.2);
		l1.addEntry(2010.0, 96.6);
		l1.addEntry(2020.0, 96.4);
		l1.addEntry(2030.0, 96.7);
		l1.addEntry(2040.0, 96.8);
		l1.addEntry(2050.0, 96.6);
		l1.addEntry(2060.0, 96.6);
		l1.addEntry(2070.0, 96.5);
		l1.addEntry(2080.0, 96.6);
		l1.addEntry(2090.0, 96.4);
		l1.addEntry(2100.0, 96.6);
		l1.addEntry(2110.0, 96.5);
		l1.addEntry(2120.0, 96.2);
		l1.addEntry(2130.0, 96.2);
		l1.addEntry(2140.0, 96.5);
		l1.addEntry(2150.0, 96.0);
		l1.addEntry(2160.0, 96.2);
		l1.addEntry(2170.0, 96.3);
		l1.addEntry(2180.0, 96.4);
		l1.addEntry(2190.0, 97.0);
		l1.addEntry(2200.0, 96.8);
		l1.addEntry(2210.0, 96.5);
		l1.addEntry(2220.0, 96.6);
		l1.addEntry(2230.0, 96.1);
		l1.addEntry(2240.0, 96.1);
		l1.addEntry(2250.0, 96.6);
		l1.addEntry(2260.0, 96.5);
		l1.addEntry(2270.0, 96.6);
		l1.addEntry(2280.0, 96.4);
		l1.addEntry(2290.0, 96.5);
		l1.addEntry(2300.0, 96.6);
		l1.addEntry(2310.0, 96.9);
		l1.addEntry(2320.0, 96.8);
		l1.addEntry(2330.0, 96.9);
		l1.addEntry(2340.0, 97.2);
		l1.addEntry(2350.0, 96.6);
		l1.addEntry(2360.0, 97.3);
		l1.addEntry(2370.0, 97.4);
		l1.addEntry(2380.0, 97.1);
		l1.addEntry(2390.0, 97.1);
		l1.addEntry(2400.0, 96.8);
		l1.addEntry(2410.0, 97.0);
		l1.addEntry(2420.0, 97.1);
		l1.addEntry(2430.0, 97.1);
		l1.addEntry(2440.0, 97.0);
		l1.addEntry(2450.0, 97.1);
		l1.addEntry(2460.0, 97.1);
		l1.addEntry(2470.0, 97.5);
		l1.addEntry(2480.0, 96.9);
		l1.addEntry(2490.0, 96.8);
		l1.addEntry(2500.0, 96.8);
		l1.addEntry(2510.0, 97.0);
		l1.addEntry(2520.0, 96.7);
		l1.addEntry(2530.0, 97.0);
		l1.addEntry(2540.0, 97.1);
		l1.addEntry(2550.0, 97.2);
		l1.addEntry(2560.0, 97.1);
		l1.addEntry(2570.0, 97.1);
		l1.addEntry(2580.0, 97.1);
		l1.addEntry(2590.0, 96.8);
		l1.addEntry(2600.0, 97.2);
		l1.addEntry(2610.0, 97.1);
		l1.addEntry(2620.0, 97.3);
		l1.addEntry(2630.0, 97.1);
		l1.addEntry(2640.0, 97.1);
		l1.addEntry(2650.0, 97.1);
		l1.addEntry(2660.0, 97.0);
		l1.addEntry(2670.0, 96.8);
		l1.addEntry(2680.0, 97.3);
		l1.addEntry(2690.0, 97.4);
		l1.addEntry(2700.0, 97.3);
		l1.addEntry(2710.0, 97.2);
		l1.addEntry(2720.0, 97.1);
		l1.addEntry(2730.0, 97.2);
		l1.addEntry(2740.0, 97.1);
		l1.addEntry(2750.0, 97.1);
		l1.addEntry(2760.0, 97.1);
		l1.addEntry(2770.0, 96.8);
		l1.addEntry(2780.0, 96.4);
		l1.addEntry(2790.0, 96.6);
		l1.addEntry(2800.0, 96.6);

		NumberSeries<Double, Double> l2 = new NumberSeries<Double, Double>();
		l2.addEntry(0.0, 1788.1);
		l2.addEntry(10.0, 1803.3);
		l2.addEntry(20.0, 1807.3);
		l2.addEntry(30.0, 1813.5);
		l2.addEntry(40.0, 1822.0);
		l2.addEntry(50.0, 1820.3);
		l2.addEntry(60.0, 1823.7);
		l2.addEntry(70.0, 1823.7);
		l2.addEntry(80.0, 1825.3);
		l2.addEntry(90.0, 1831.0);
		l2.addEntry(100.0, 1832.1);
		l2.addEntry(110.0, 1834.4);
		l2.addEntry(120.0, 1834.4);
		l2.addEntry(130.0, 1831.5);
		l2.addEntry(140.0, 1832.7);
		l2.addEntry(150.0, 1834.4);
		l2.addEntry(160.0, 1831.5);
		l2.addEntry(170.0, 1832.1);
		l2.addEntry(180.0, 1830.4);
		l2.addEntry(190.0, 1831.0);
		l2.addEntry(200.0, 1830.4);
		l2.addEntry(210.0, 1829.3);
		l2.addEntry(220.0, 1829.9);
		l2.addEntry(230.0, 1828.2);
		l2.addEntry(240.0, 1831.0);
		l2.addEntry(250.0, 1828.7);
		l2.addEntry(260.0, 1827.0);
		l2.addEntry(270.0, 1829.3);
		l2.addEntry(280.0, 1826.5);
		l2.addEntry(290.0, 1824.8);
		l2.addEntry(300.0, 1824.2);
		l2.addEntry(310.0, 1823.7);
		l2.addEntry(320.0, 1823.7);
		l2.addEntry(330.0, 1823.7);
		l2.addEntry(340.0, 1825.3);
		l2.addEntry(350.0, 1822.0);
		l2.addEntry(360.0, 1820.3);
		l2.addEntry(370.0, 1818.0);
		l2.addEntry(380.0, 1819.1);
		l2.addEntry(390.0, 1816.3);
		l2.addEntry(400.0, 1820.8);
		l2.addEntry(410.0, 1820.8);
		l2.addEntry(420.0, 1819.7);
		l2.addEntry(430.0, 1820.3);
		l2.addEntry(440.0, 1819.7);
		l2.addEntry(450.0, 1819.1);
		l2.addEntry(460.0, 1819.1);
		l2.addEntry(470.0, 1821.4);
		l2.addEntry(480.0, 1821.4);
		l2.addEntry(490.0, 1818.0);
		l2.addEntry(500.0, 1816.9);
		l2.addEntry(510.0, 1819.1);
		l2.addEntry(520.0, 1818.6);
		l2.addEntry(530.0, 1816.9);
		l2.addEntry(540.0, 1816.9);
		l2.addEntry(550.0, 1815.2);
		l2.addEntry(560.0, 1814.1);
		l2.addEntry(570.0, 1814.6);
		l2.addEntry(580.0, 1811.2);
		l2.addEntry(590.0, 1814.1);
		l2.addEntry(600.0, 1813.5);
		l2.addEntry(610.0, 1812.4);
		l2.addEntry(620.0, 1809.0);
		l2.addEntry(630.0, 1813.5);
		l2.addEntry(640.0, 1811.8);
		l2.addEntry(650.0, 1815.8);
		l2.addEntry(660.0, 1816.3);
		l2.addEntry(670.0, 1815.2);
		l2.addEntry(680.0, 1815.2);
		l2.addEntry(690.0, 1815.8);
		l2.addEntry(700.0, 1816.3);
		l2.addEntry(710.0, 1818.6);
		l2.addEntry(720.0, 1816.9);
		l2.addEntry(730.0, 1814.6);
		l2.addEntry(740.0, 1816.3);
		l2.addEntry(750.0, 1814.1);
		l2.addEntry(760.0, 1812.9);
		l2.addEntry(770.0, 1812.9);
		l2.addEntry(780.0, 1811.2);
		l2.addEntry(790.0, 1812.4);
		l2.addEntry(800.0, 1815.2);
		l2.addEntry(810.0, 1812.4);
		l2.addEntry(820.0, 1813.5);
		l2.addEntry(830.0, 1811.8);
		l2.addEntry(840.0, 1811.2);
		l2.addEntry(850.0, 1812.9);
		l2.addEntry(860.0, 1809.0);
		l2.addEntry(870.0, 1811.2);
		l2.addEntry(880.0, 1816.9);
		l2.addEntry(890.0, 1815.2);
		l2.addEntry(900.0, 1813.5);
		l2.addEntry(910.0, 1812.9);
		l2.addEntry(920.0, 1815.8);
		l2.addEntry(930.0, 1819.1);
		l2.addEntry(940.0, 1818.0);
		l2.addEntry(950.0, 1816.3);
		l2.addEntry(960.0, 1818.0);
		l2.addEntry(970.0, 1815.2);
		l2.addEntry(980.0, 1818.6);
		l2.addEntry(990.0, 1815.2);
		l2.addEntry(1000.0, 1822.5);
		l2.addEntry(1010.0, 1822.5);
		l2.addEntry(1020.0, 1816.9);
		l2.addEntry(1030.0, 1816.3);
		l2.addEntry(1040.0, 1817.4);
		l2.addEntry(1050.0, 1816.9);
		l2.addEntry(1060.0, 1811.8);
		l2.addEntry(1070.0, 1818.6);
		l2.addEntry(1080.0, 1818.6);
		l2.addEntry(1090.0, 1815.2);
		l2.addEntry(1100.0, 1816.9);
		l2.addEntry(1110.0, 1815.8);
		l2.addEntry(1120.0, 1815.8);
		l2.addEntry(1130.0, 1816.9);
		l2.addEntry(1140.0, 1815.2);
		l2.addEntry(1150.0, 1815.2);
		l2.addEntry(1160.0, 1818.0);
		l2.addEntry(1170.0, 1817.4);
		l2.addEntry(1180.0, 1818.0);
		l2.addEntry(1190.0, 1819.1);
		l2.addEntry(1200.0, 1817.4);
		l2.addEntry(1210.0, 1822.5);
		l2.addEntry(1220.0, 1313.9);
		l2.addEntry(1230.0, 1694.5);
		l2.addEntry(1240.0, 1891.3);
		l2.addEntry(1250.0, 1813.5);
		l2.addEntry(1260.0, 1827.0);
		l2.addEntry(1270.0, 1831.5);
		l2.addEntry(1280.0, 1827.6);
		l2.addEntry(1290.0, 1832.1);
		l2.addEntry(1300.0, 1831.5);
		l2.addEntry(1310.0, 1829.9);
		l2.addEntry(1320.0, 1834.4);
		l2.addEntry(1330.0, 1831.0);
		l2.addEntry(1340.0, 1827.6);
		l2.addEntry(1350.0, 1829.3);
		l2.addEntry(1360.0, 1832.1);
		l2.addEntry(1370.0, 1834.9);
		l2.addEntry(1380.0, 1834.9);
		l2.addEntry(1390.0, 1839.4);
		l2.addEntry(1400.0, 1830.4);
		l2.addEntry(1410.0, 1832.7);
		l2.addEntry(1420.0, 1833.8);
		l2.addEntry(1430.0, 1847.9);
		l2.addEntry(1440.0, 1770.6);
		l2.addEntry(1450.0, 1668.0);
		l2.addEntry(1460.0, 1279.5);
		l2.addEntry(1470.0, 1138.5);
		l2.addEntry(1480.0, 1724.4);
		l2.addEntry(1490.0, 1571.0);
		l2.addEntry(1500.0, 1740.8);
		l2.addEntry(1510.0, 1326.8);
		l2.addEntry(1520.0, 1661.2);
		l2.addEntry(1530.0, 1859.2);
		l2.addEntry(1540.0, 1851.8);
		l2.addEntry(1550.0, 1885.7);
		l2.addEntry(1560.0, 1876.1);
		l2.addEntry(1570.0, 1860.3);
		l2.addEntry(1580.0, 1870.5);
		l2.addEntry(1590.0, 1851.8);
		l2.addEntry(1600.0, 1853.5);
		l2.addEntry(1610.0, 1863.7);
		l2.addEntry(1620.0, 1854.1);
		l2.addEntry(1630.0, 1855.8);
		l2.addEntry(1640.0, 1858.6);
		l2.addEntry(1650.0, 1857.5);
		l2.addEntry(1660.0, 1858.6);
		l2.addEntry(1670.0, 1841.7);
		l2.addEntry(1680.0, 1824.2);
		l2.addEntry(1690.0, 1817.4);
		l2.addEntry(1700.0, 1813.5);
		l2.addEntry(1710.0, 1814.6);
		l2.addEntry(1720.0, 1809.0);
		l2.addEntry(1730.0, 1806.2);
		l2.addEntry(1740.0, 1803.9);
		l2.addEntry(1750.0, 1804.5);
		l2.addEntry(1760.0, 1798.8);
		l2.addEntry(1770.0, 1793.8);
		l2.addEntry(1780.0, 1792.1);
		l2.addEntry(1790.0, 1793.2);
		l2.addEntry(1800.0, 1792.6);
		l2.addEntry(1810.0, 1787.0);
		l2.addEntry(1820.0, 1787.0);
		l2.addEntry(1830.0, 1786.4);
		l2.addEntry(1840.0, 1788.1);
		l2.addEntry(1850.0, 1784.7);
		l2.addEntry(1860.0, 1781.4);
		l2.addEntry(1870.0, 1780.2);
		l2.addEntry(1880.0, 1777.4);
		l2.addEntry(1890.0, 1775.7);
		l2.addEntry(1900.0, 1775.2);
		l2.addEntry(1910.0, 1775.2);
		l2.addEntry(1920.0, 1776.8);
		l2.addEntry(1930.0, 1778.0);
		l2.addEntry(1940.0, 1775.7);
		l2.addEntry(1950.0, 1769.5);
		l2.addEntry(1960.0, 1769.5);
		l2.addEntry(1970.0, 1768.4);
		l2.addEntry(1980.0, 1771.2);
		l2.addEntry(1990.0, 1770.1);
		l2.addEntry(2000.0, 1769.5);
		l2.addEntry(2010.0, 1767.8);
		l2.addEntry(2020.0, 1764.4);
		l2.addEntry(2030.0, 1764.4);
		l2.addEntry(2040.0, 1765.0);
		l2.addEntry(2050.0, 1762.7);
		l2.addEntry(2060.0, 1765.6);
		l2.addEntry(2070.0, 1763.9);
		l2.addEntry(2080.0, 1762.2);
		l2.addEntry(2090.0, 1759.9);
		l2.addEntry(2100.0, 1759.9);
		l2.addEntry(2110.0, 1762.2);
		l2.addEntry(2120.0, 1762.7);
		l2.addEntry(2130.0, 1762.2);
		l2.addEntry(2140.0, 1762.7);
		l2.addEntry(2150.0, 1759.4);
		l2.addEntry(2160.0, 1761.1);
		l2.addEntry(2170.0, 1761.6);
		l2.addEntry(2180.0, 1763.3);
		l2.addEntry(2190.0, 1765.0);
		l2.addEntry(2200.0, 1768.4);
		l2.addEntry(2210.0, 1763.3);
		l2.addEntry(2220.0, 1762.7);
		l2.addEntry(2230.0, 1759.9);
		l2.addEntry(2240.0, 1762.7);
		l2.addEntry(2250.0, 1764.4);
		l2.addEntry(2260.0, 1765.6);
		l2.addEntry(2270.0, 1766.7);
		l2.addEntry(2280.0, 1763.3);
		l2.addEntry(2290.0, 1763.3);
		l2.addEntry(2300.0, 1763.9);
		l2.addEntry(2310.0, 1762.7);
		l2.addEntry(2320.0, 1762.7);
		l2.addEntry(2330.0, 1767.3);
		l2.addEntry(2340.0, 1767.8);
		l2.addEntry(2350.0, 1765.6);
		l2.addEntry(2360.0, 1766.1);
		l2.addEntry(2370.0, 1766.7);
		l2.addEntry(2380.0, 1766.7);
		l2.addEntry(2390.0, 1765.0);
		l2.addEntry(2400.0, 1765.0);
		l2.addEntry(2410.0, 1765.0);
		l2.addEntry(2420.0, 1765.0);
		l2.addEntry(2430.0, 1765.6);
		l2.addEntry(2440.0, 1765.6);
		l2.addEntry(2450.0, 1763.3);
		l2.addEntry(2460.0, 1767.8);
		l2.addEntry(2470.0, 1767.8);
		l2.addEntry(2480.0, 1765.0);
		l2.addEntry(2490.0, 1761.6);
		l2.addEntry(2500.0, 1761.6);
		l2.addEntry(2510.0, 1762.7);
		l2.addEntry(2520.0, 1763.3);
		l2.addEntry(2530.0, 1763.3);
		l2.addEntry(2540.0, 1763.9);
		l2.addEntry(2550.0, 1765.0);
		l2.addEntry(2560.0, 1766.1);
		l2.addEntry(2570.0, 1765.6);
		l2.addEntry(2580.0, 1766.7);
		l2.addEntry(2590.0, 1765.6);
		l2.addEntry(2600.0, 1768.4);
		l2.addEntry(2610.0, 1766.7);
		l2.addEntry(2620.0, 1764.4);
		l2.addEntry(2630.0, 1764.4);
		l2.addEntry(2640.0, 1766.1);
		l2.addEntry(2650.0, 1766.1);
		l2.addEntry(2660.0, 1766.1);
		l2.addEntry(2670.0, 1763.9);
		l2.addEntry(2680.0, 1765.6);
		l2.addEntry(2690.0, 1765.6);
		l2.addEntry(2700.0, 1765.6);
		l2.addEntry(2710.0, 1765.0);
		l2.addEntry(2720.0, 1765.6);
		l2.addEntry(2730.0, 1766.1);
		l2.addEntry(2740.0, 1767.3);
		l2.addEntry(2750.0, 1766.7);
		l2.addEntry(2760.0, 1762.2);
		l2.addEntry(2770.0, 1754.9);
		l2.addEntry(2780.0, 1750.9);
		l2.addEntry(2790.0, 1750.3);
		l2.addEntry(2800.0, 1748.1);

		NumberSeries<Double, Double> l3 = new NumberSeries<Double, Double>();
		l3.addEntry(0.0, 1503.0);
		l3.addEntry(10.0, 3006.0);
		l3.addEntry(20.0, 3005.0);
		l3.addEntry(30.0, 1505.0);
		l3.addEntry(40.0, 1505.0);
		l3.addEntry(50.0, 3015.0);
		l3.addEntry(60.0, 1503.0);
		l3.addEntry(70.0, 3006.0);
		l3.addEntry(80.0, 3006.0);
		l3.addEntry(90.0, 1503.0);
		l3.addEntry(100.0, 1503.0);
		l3.addEntry(110.0, 1503.0);
		l3.addEntry(120.0, 1500.0);
		l3.addEntry(130.0, 1503.0);
		l3.addEntry(140.0, 752.0);
		l3.addEntry(150.0, 1503.0);
		l3.addEntry(160.0, 1503.0);
		l3.addEntry(170.0, 1503.0);
		l3.addEntry(180.0, 1505.0);
		l3.addEntry(190.0, 1503.0);
		l3.addEntry(200.0, 1503.0);
		l3.addEntry(210.0, 3006.0);
		l3.addEntry(220.0, 1503.0);
		l3.addEntry(230.0, 1503.0);
		l3.addEntry(240.0, 1502.0);
		l3.addEntry(250.0, 1503.0);
		l3.addEntry(260.0, 3005.0);
		l3.addEntry(270.0, 1500.0);
		l3.addEntry(280.0, 1502.0);
		l3.addEntry(290.0, 1502.0);
		l3.addEntry(300.0, 1502.0);
		l3.addEntry(310.0, 752.0);
		l3.addEntry(320.0, 1502.0);
		l3.addEntry(330.0, 1502.0);
		l3.addEntry(340.0, 1504.0);
		l3.addEntry(350.0, 1502.0);
		l3.addEntry(360.0, 1502.0);
		l3.addEntry(370.0, 1501.0);
		l3.addEntry(380.0, 1502.0);
		l3.addEntry(390.0, 501.0);
		l3.addEntry(400.0, 1501.0);
		l3.addEntry(410.0, 501.0);
		l3.addEntry(420.0, 751.0);
		l3.addEntry(430.0, 751.0);
		l3.addEntry(440.0, 1503.0);
		l3.addEntry(450.0, 750.0);
		l3.addEntry(460.0, 1501.0);
		l3.addEntry(470.0, 1503.0);
		l3.addEntry(480.0, 501.0);
		l3.addEntry(490.0, 1501.0);
		l3.addEntry(500.0, 1501.0);
		l3.addEntry(510.0, 501.0);
		l3.addEntry(520.0, 1501.0);
		l3.addEntry(530.0, 751.0);
		l3.addEntry(540.0, 1501.0);
		l3.addEntry(550.0, 1501.0);
		l3.addEntry(560.0, 1501.0);
		l3.addEntry(570.0, 1501.0);
		l3.addEntry(580.0, 1504.0);
		l3.addEntry(590.0, 1504.0);
		l3.addEntry(600.0, 1502.0);
		l3.addEntry(610.0, 751.0);
		l3.addEntry(620.0, 1501.0);
		l3.addEntry(630.0, 1501.0);
		l3.addEntry(640.0, 1501.0);
		l3.addEntry(650.0, 1501.0);
		l3.addEntry(660.0, 1504.0);
		l3.addEntry(670.0, 1502.0);
		l3.addEntry(680.0, 751.0);
		l3.addEntry(690.0, 751.0);
		l3.addEntry(700.0, 1501.0);
		l3.addEntry(710.0, 751.0);
		l3.addEntry(720.0, 1501.0);
		l3.addEntry(730.0, 1502.0);
		l3.addEntry(740.0, 1502.0);
		l3.addEntry(750.0, 751.0);
		l3.addEntry(760.0, 376.0);
		l3.addEntry(770.0, 1502.0);
		l3.addEntry(780.0, 1501.0);
		l3.addEntry(790.0, 1502.0);
		l3.addEntry(800.0, 1499.0);
		l3.addEntry(810.0, 1499.0);
		l3.addEntry(820.0, 750.0);
		l3.addEntry(830.0, 1499.0);
		l3.addEntry(840.0, 501.0);
		l3.addEntry(850.0, 300.0);
		l3.addEntry(860.0, 1504.0);
		l3.addEntry(870.0, 751.0);
		l3.addEntry(880.0, 1502.0);
		l3.addEntry(890.0, 1502.0);
		l3.addEntry(900.0, 1502.0);
		l3.addEntry(910.0, 751.0);
		l3.addEntry(920.0, 501.0);
		l3.addEntry(930.0, 1502.0);
		l3.addEntry(940.0, 751.0);
		l3.addEntry(950.0, 1502.0);
		l3.addEntry(960.0, 501.0);
		l3.addEntry(970.0, 1504.0);
		l3.addEntry(980.0, 751.0);
		l3.addEntry(990.0, 1502.0);
		l3.addEntry(1000.0, 751.0);
		l3.addEntry(1010.0, 1502.0);
		l3.addEntry(1020.0, 500.0);
		l3.addEntry(1030.0, 751.0);
		l3.addEntry(1040.0, 1502.0);
		l3.addEntry(1050.0, 751.0);
		l3.addEntry(1060.0, 1502.0);
		l3.addEntry(1070.0, 1502.0);
		l3.addEntry(1080.0, 751.0);
		l3.addEntry(1090.0, 751.0);
		l3.addEntry(1100.0, 1502.0);
		l3.addEntry(1110.0, 750.0);
		l3.addEntry(1120.0, 1502.0);
		l3.addEntry(1130.0, 375.0);
		l3.addEntry(1140.0, 1502.0);
		l3.addEntry(1150.0, 300.0);
		l3.addEntry(1160.0, 375.0);
		l3.addEntry(1170.0, 1499.0);
		l3.addEntry(1180.0, 300.0);
		l3.addEntry(1190.0, 375.0);
		l3.addEntry(1200.0, 1502.0);
		l3.addEntry(1210.0, 373.0);
		l3.addEntry(1220.0, 368.0);
		l3.addEntry(1230.0, 502.0);
		l3.addEntry(1240.0, 495.0);
		l3.addEntry(1250.0, 1475.0);
		l3.addEntry(1260.0, 1468.0);
		l3.addEntry(1270.0, 732.0);
		l3.addEntry(1280.0, 1461.0);
		l3.addEntry(1290.0, 1458.0);
		l3.addEntry(1300.0, 1456.0);
		l3.addEntry(1310.0, 1456.0);
		l3.addEntry(1320.0, 1451.0);
		l3.addEntry(1330.0, 1453.0);
		l3.addEntry(1340.0, 1453.0);
		l3.addEntry(1350.0, 726.0);
		l3.addEntry(1360.0, 1451.0);
		l3.addEntry(1370.0, 1451.0);
		l3.addEntry(1380.0, 1451.0);
		l3.addEntry(1390.0, 1451.0);
		l3.addEntry(1400.0, 1449.0);
		l3.addEntry(1410.0, 1449.0);
		l3.addEntry(1420.0, 1449.0);
		l3.addEntry(1430.0, 1944.0);
		l3.addEntry(1440.0, 1197.0);
		l3.addEntry(1450.0, 786.0);
		l3.addEntry(1460.0, 0.0);
		l3.addEntry(1470.0, 0.0);
		l3.addEntry(1480.0, 1079.0);
		l3.addEntry(1490.0, 1070.0);
		l3.addEntry(1500.0, 1085.0);
		l3.addEntry(1510.0, 923.0);
		l3.addEntry(1520.0, 1121.0);
		l3.addEntry(1530.0, 1293.0);
		l3.addEntry(1540.0, 1762.0);
		l3.addEntry(1550.0, 367.0);
		l3.addEntry(1560.0, 352.0);
		l3.addEntry(1570.0, 186.0);
		l3.addEntry(1580.0, 892.0);
		l3.addEntry(1590.0, 892.0);
		l3.addEntry(1600.0, 892.0);
		l3.addEntry(1610.0, 892.0);
		l3.addEntry(1620.0, 892.0);
		l3.addEntry(1630.0, 892.0);
		l3.addEntry(1640.0, 892.0);
		l3.addEntry(1650.0, 892.0);
		l3.addEntry(1660.0, 892.0);
		l3.addEntry(1670.0, 892.0);
		l3.addEntry(1680.0, 0.0);
		l3.addEntry(1690.0, 0.0);
		l3.addEntry(1700.0, 0.0);
		l3.addEntry(1710.0, 0.0);
		l3.addEntry(1720.0, 0.0);
		l3.addEntry(1730.0, 0.0);
		l3.addEntry(1740.0, 0.0);
		l3.addEntry(1750.0, 0.0);
		l3.addEntry(1760.0, 0.0);
		l3.addEntry(1770.0, 0.0);
		l3.addEntry(1780.0, 0.0);
		l3.addEntry(1790.0, 0.0);
		l3.addEntry(1800.0, 0.0);
		l3.addEntry(1810.0, 0.0);
		l3.addEntry(1820.0, 0.0);
		l3.addEntry(1830.0, 0.0);
		l3.addEntry(1840.0, 0.0);
		l3.addEntry(1850.0, 0.0);
		l3.addEntry(1860.0, 0.0);
		l3.addEntry(1870.0, 0.0);
		l3.addEntry(1880.0, 0.0);
		l3.addEntry(1890.0, 0.0);
		l3.addEntry(1900.0, 0.0);
		l3.addEntry(1910.0, 0.0);
		l3.addEntry(1920.0, 0.0);
		l3.addEntry(1930.0, 0.0);
		l3.addEntry(1940.0, 0.0);
		l3.addEntry(1950.0, 0.0);
		l3.addEntry(1960.0, 0.0);
		l3.addEntry(1970.0, 0.0);
		l3.addEntry(1980.0, 0.0);
		l3.addEntry(1990.0, 0.0);
		l3.addEntry(2000.0, 0.0);
		l3.addEntry(2010.0, 0.0);
		l3.addEntry(2020.0, 0.0);
		l3.addEntry(2030.0, 0.0);
		l3.addEntry(2040.0, 0.0);
		l3.addEntry(2050.0, 0.0);
		l3.addEntry(2060.0, 0.0);
		l3.addEntry(2070.0, 0.0);
		l3.addEntry(2080.0, 0.0);
		l3.addEntry(2090.0, 0.0);
		l3.addEntry(2100.0, 0.0);
		l3.addEntry(2110.0, 0.0);
		l3.addEntry(2120.0, 0.0);
		l3.addEntry(2130.0, 0.0);
		l3.addEntry(2140.0, 0.0);
		l3.addEntry(2150.0, 0.0);
		l3.addEntry(2160.0, 0.0);
		l3.addEntry(2170.0, 0.0);
		l3.addEntry(2180.0, 0.0);
		l3.addEntry(2190.0, 0.0);
		l3.addEntry(2200.0, 0.0);
		l3.addEntry(2210.0, 0.0);
		l3.addEntry(2220.0, 0.0);
		l3.addEntry(2230.0, 0.0);
		l3.addEntry(2240.0, 0.0);
		l3.addEntry(2250.0, 0.0);
		l3.addEntry(2260.0, 0.0);
		l3.addEntry(2270.0, 0.0);
		l3.addEntry(2280.0, 0.0);
		l3.addEntry(2290.0, 0.0);
		l3.addEntry(2300.0, 0.0);
		l3.addEntry(2310.0, 0.0);
		l3.addEntry(2320.0, 0.0);
		l3.addEntry(2330.0, 0.0);
		l3.addEntry(2340.0, 0.0);
		l3.addEntry(2350.0, 0.0);
		l3.addEntry(2360.0, 0.0);
		l3.addEntry(2370.0, 0.0);
		l3.addEntry(2380.0, 0.0);
		l3.addEntry(2390.0, 0.0);
		l3.addEntry(2400.0, 0.0);
		l3.addEntry(2410.0, 0.0);
		l3.addEntry(2420.0, 0.0);
		l3.addEntry(2430.0, 0.0);
		l3.addEntry(2440.0, 0.0);
		l3.addEntry(2450.0, 0.0);
		l3.addEntry(2460.0, 0.0);
		l3.addEntry(2470.0, 0.0);
		l3.addEntry(2480.0, 0.0);
		l3.addEntry(2490.0, 0.0);
		l3.addEntry(2500.0, 0.0);
		l3.addEntry(2510.0, 0.0);
		l3.addEntry(2520.0, 0.0);
		l3.addEntry(2530.0, 0.0);
		l3.addEntry(2540.0, 0.0);
		l3.addEntry(2550.0, 0.0);
		l3.addEntry(2560.0, 0.0);
		l3.addEntry(2570.0, 0.0);
		l3.addEntry(2580.0, 0.0);
		l3.addEntry(2590.0, 0.0);
		l3.addEntry(2600.0, 0.0);
		l3.addEntry(2610.0, 0.0);
		l3.addEntry(2620.0, 0.0);
		l3.addEntry(2630.0, 0.0);
		l3.addEntry(2640.0, 0.0);
		l3.addEntry(2650.0, 0.0);
		l3.addEntry(2660.0, 0.0);
		l3.addEntry(2670.0, 0.0);
		l3.addEntry(2680.0, 0.0);
		l3.addEntry(2690.0, 0.0);
		l3.addEntry(2700.0, 0.0);
		l3.addEntry(2710.0, 0.0);
		l3.addEntry(2720.0, 0.0);
		l3.addEntry(2730.0, 0.0);
		l3.addEntry(2740.0, 0.0);
		l3.addEntry(2750.0, 0.0);
		l3.addEntry(2760.0, 0.0);
		l3.addEntry(2770.0, 0.0);
		l3.addEntry(2780.0, 0.0);
		l3.addEntry(2790.0, 0.0);
		l3.addEntry(2800.0, 0.0);

		@SuppressWarnings("unchecked")
		JQPlot chart2 =
			new JQPlot("chart2", new ListModel<NumberSeries<Double, Double>>(Arrays.asList(l1, l2,
				l3)));
		chart2.setOutputMarkupId(true);
		PlotOptions chart2O = chart2.getOptions();
		chart2O.setTitle(new PlotTitle("Plot with Zooming and 3 Y Axes"));
		chart2O.getSeriesDefaults().setShowMarker(false);
		chart2O.getSeries().add(new PlotSeries());
		chart2O.addNewSeries().setYaxis("y2axis");
		chart2O.addNewSeries().setYaxis("y3axis");
		chart2O.getCursor().setShow(true);
		chart2O.getCursor().setTooltipLocation(PlotTooltipLocation.sw);
		chart2O.getCursor().setZoom(true);
		chart2O.getCursor().setShowTooltipGridPosition(true);
		chart2O.getAxesDefaults().setUseSeriesColor(true);
		chart2O.getAxes().getXaxis().setMin(0);
		chart2O.getAxes().getXaxis().setMax(1600);
		chart2O.getAxes().getYaxis().setMin(0);
		chart2O.getAxes().getYaxis().setMax(600);
		chart2O.getAxes().getY2axis().setMin(1000);
		chart2O.getAxes().getY2axis().setMax(2000);
		chart2O.getAxes().getY2axis().setNumberTicks(9);
		chart2O.getAxes().getY2axis().getTickOptions().setShowGridline(true);
		chart2O.getAxes().getY3axis();

		add(chart2);
	}
}
