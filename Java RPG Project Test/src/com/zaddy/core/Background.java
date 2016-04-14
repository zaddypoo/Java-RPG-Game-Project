package com.zaddy.core;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Background extends Rectangle
{
	public int[] id = { -1, -1 };

	public Background(Rectangle rect, int id[])
	{
		setBounds(rect);
		this.id = id;
	}

	public void render(Graphics g)
	{
	}
}
