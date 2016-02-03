package com.sqa.kv.shape.project;

import com.sqa.kv.util.helper.RequestInput;

/*
 * Create the Shape Class with following properties and behaviors 
 * (for the behaviors there will be no implementation just conform to 
 * the method signatures and return a valid value to match signature, 
 * include system out calls to detail what information should be calculated):

 * Fields/ Properties/ Instance Variables:
 * String name (any name you may give the instance - ex: "My First Shape")
 * String type (the type of shape - ex: circle, square, rectangle, triangle)
 * String color
 * int numSides
 * boolean ellipse
 * boolean polygon
 * boolean square

 * Methods/ Behaviors/ Functions:
 * double calcArea()
 * double calcPerimeter()
 * void fillShape()
 * void drawShape()

 * Override the toString method and Create the following constructors:

 * Default,
 * One that takes the name and type
 * One that takes all properties
 */

public class Shape
{
	private String name;
	private String type;
	private String color;
	private int numSides;
	private boolean ellipse;
	private boolean polygon;
	private boolean square;

	public Shape()
	{
		this(RequestInput.getString("What is the name of the shape:"), RequestInput.getStringIgnoreCase(
				"What is the type of the shape:", "Square", "Circle", "Triangle"), RequestInput
				.getString("What is the color of the shape:"));
	}

	public Shape(String name, String type, String color)
	{
		super();
		this.setName(this.name);
		this.setType(type);
		this.setColor(color);
		switch (type.toLowerCase())
		{
		case "square":
			this.setEllipse(false);
			this.setSquare(true);
			this.setPolygon(false);
			this.setNumSides(4);
			break;
		case "circle":
			this.setEllipse(true);
			this.setSquare(false);
			this.setPolygon(false);
			this.setNumSides(0);
			break;
		case "triangle":
			this.setEllipse(false);
			this.setSquare(false);
			this.setPolygon(true);
			this.setNumSides(3);
			break;
		default:
			this.setEllipse(false);
			this.setSquare(false);
			this.setPolygon(false);
			this.setNumSides(0);
			break;
		}
	}

	public Shape(String name, String type, String color, int numSides, boolean ellipse, boolean polygon, boolean square)
	{
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.numSides = numSides;
		this.ellipse = ellipse;
		this.polygon = polygon;
		this.square = square;
	}

	/**
	 * @return the color
	 */
	public String getColor()
	{
		return this.color;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @return the numSides
	 */
	public int getNumSides()
	{
		return this.numSides;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return this.type;
	}

	/**
	 * @return the ellipse
	 */
	public boolean isellipse()
	{
		return this.ellipse;
	}

	/**
	 * @return the polygon
	 */
	public boolean isPolygon()
	{
		return this.polygon;
	}

	/**
	 * @return the square
	 */
	public boolean isSquare()
	{
		return this.square;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * @param ellipse
	 *            the ellipse to set
	 */
	public void setEllipse(boolean ellipse)
	{
		this.ellipse = ellipse;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param numSides
	 *            the numSides to set
	 */
	public void setNumSides(int numSides)
	{
		this.numSides = numSides;
	}

	/**
	 * @param polygon
	 *            the polygon to set
	 */
	public void setPolygon(boolean polygon)
	{
		this.polygon = polygon;
	}

	/**
	 * @param square
	 *            the square to set
	 */
	public void setSquare(boolean square)
	{
		this.square = square;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Shape name=");
		builder.append(this.name);
		builder.append(", type=");
		builder.append(this.type);
		builder.append(", color=");
		builder.append(this.color);
		builder.append(", numSides=");
		builder.append(this.numSides);
		builder.append(", ellipse=");
		builder.append(this.ellipse);
		builder.append(", polygon=");
		builder.append(this.polygon);
		builder.append(", square=");
		builder.append(this.square);
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString2()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("My Shape:");
		sb.append(this.getName());
		sb.append(" (");
		sb.append(this.getType());
		sb.append(")");
		return sb.toString();
	}
}
