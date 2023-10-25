package com.design.estrutural.Facade;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

// Veja a qunatidade de libs que preciso importar para fazer com que a imagem tenha um resize. Com isso eu crio uma fachada para que esconde isso do cliente.
public class ResizeImage {

    public void resize(String imagePath) {
        try {
            File imageToResize = new File(imagePath);
            BufferedImage bufferedImage = ImageIO.read(imageToResize);
            Image image = bufferedImage.getScaledInstance(350, 350, Image.SCALE_DEFAULT);

            // save the resize image aka thumbnail
            ImageIO.write(
                    convertToBufferedImage(image),
                    "png",
                    new File("C:\\Users\\Lucas\\Desktop\\java teste\\demo\\src\\main\\java\\com\\design\\estrutural\\Facade\\image-resized.png"));

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

 

    // convert Image to BufferedImage
    public static BufferedImage convertToBufferedImage(Image img) {

        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bi = new BufferedImage(
                img.getWidth(null), img.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);

        Graphics2D graphics2D = bi.createGraphics();
        graphics2D.drawImage(img, 0, 0, null);
        graphics2D.dispose();

        return bi;
    }

}
