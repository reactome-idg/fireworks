package org.reactome.web.fireworks.util.popups.export;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import org.reactome.web.fireworks.client.FireworksFactory;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kostas Sidiropoulos <ksidiro@ebi.ac.uk>
 */
public enum ImageDownloadType implements DownloadType {
    SVG     ("SVG",     "/diagram/__STID__.svg__PARAMS__",   "SVG",     ImageFormatIcons.INSTANCE.SVGIcon()),
    PNG     ("PNG",     "/diagram/__STID__.png__PARAMS__",   "PNG",     ImageFormatIcons.INSTANCE.PNGIcon(),    true),
    JPEG    ("JPEG",    "/diagram/__STID__.jpeg__PARAMS__",  "JPEG",    ImageFormatIcons.INSTANCE.JPEGIcon(),   true),
    JPG     ("JPG",     "/diagram/__STID__.jpg__PARAMS__",   "JPG",     ImageFormatIcons.INSTANCE.JPGIcon(),    true),
    GIF     ("GIF",     "/diagram/__STID__.gif__PARAMS__",   "GIF",     ImageFormatIcons.INSTANCE.GIFIcon(),    true),
    SBGN    ("SBGN",    "/event/__STID__.sbgn__PARAMS__",    "SBGN",    ImageFormatIcons.INSTANCE.SBGNIcon());

    //NOTE: please put the quality values below in ascending order
    public static final List<Integer> QUALITIES = Arrays.asList(2, 5, 7);

    private String name;
    private String templateURL;
    private String tooltip;
    private transient ImageResource icon;
    private boolean hasQualityOptions;

    ImageDownloadType(String name, String templateURL, String tooltip, ImageResource icon) {
        this(name, templateURL, tooltip, icon, false);
    }

    ImageDownloadType(String name, String templateURL, String tooltip, ImageResource icon, boolean hasQualityOptions) {
        this.name = name;
        this.templateURL =  FireworksFactory.SERVER + "/ContentService/exporter" + templateURL;
        this.tooltip = tooltip;
        this.icon = icon;
        this.hasQualityOptions = hasQualityOptions;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTooltip() {
        return tooltip;
    }

    @Override
    public String getTemplateURL() {
        return templateURL;
    }

    @Override
    public ImageResource getIcon() {
        return icon;
    }

    @Override
    public boolean hasQualityOptions() {
        return hasQualityOptions;
    }

    public interface ImageFormatIcons extends ClientBundle {

        ImageFormatIcons INSTANCE = GWT.create(ImageFormatIcons.class);

        @Source("../images/export2png.png")
        ImageResource PNGIcon();

        @Source("../images/export2gif.png")
        ImageResource GIFIcon();

        @Source("../images/export2jpeg.png")
        ImageResource JPEGIcon();

        @Source("../images/export2jpg.png")
        ImageResource JPGIcon();

        @Source("../images/export2svg.png")
        ImageResource SVGIcon();

        @Source("../images/export2sbgn.png")
        ImageResource SBGNIcon();

    }
}