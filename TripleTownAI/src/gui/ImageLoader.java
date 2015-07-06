package gui;

import java.util.HashMap;

import javafx.scene.image.Image;

public class ImageLoader
{

	private final HashMap<String, Image> images;

	public ImageLoader()
	{
		this.images = new HashMap<String, Image>();
	}

	public void insertImage(String key, String img)
	{
		this.images.put(key, new Image(img));
	}

	public void removeImage(String key)
	{
		this.images.remove(key);
	}

	public Image getImage(String key)
	{
		return this.images.get(key);
	}



}