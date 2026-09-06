import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.imageio.ImageIO;

public class PixelImageCreator {

    public static Color convert(String code) {
        if (code.equals("R")) {
            return new Color(237, 28, 36);
        } else if (code.equals("B")) {
            return new Color(0, 0, 0);
        } else if (code.equals("Y")) {
            return new Color(255, 242, 0);
        } else {
            return new Color(255, 255, 255);
        }
    }

    public static void main(String[] args)
            throws IOException {

        List<String> lines = Files.readAllLines(
                Paths.get("awesome_picture.txt"));

        int height = lines.size();
        int width = lines.get(0).trim().split("\\s+").length;

        BufferedImage image = new BufferedImage(
                width,
                height,
                BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            String[] pixels =
                    lines.get(y).trim().split("\\s+");

            for (int x = 0; x < width; x++) {
                Color color = convert(pixels[x]);
                image.setRGB(x, y, color.getRGB());
            }
        }

        ImageIO.write(
                image,
                "png",
                new File("created_image.png"));

        System.out.println(
                "Image created: created_image.png");
    }
}
