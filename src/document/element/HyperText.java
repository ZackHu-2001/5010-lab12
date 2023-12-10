package document.elements;

/**
 * Representation of a url.
 */
public class HyperText extends BasicText {

  /** The url to link to. */
  private final String url;

  /**
   * Creates a hypertext link.
   * 
   * @param text the text
   * @param url  the url
   */
  public HyperText(String text, String url) {
    super(text);
    this.url = url;
  }

  /**
   * Returns the url.
   * 
   * @return the url
   */
  public String getUrl() {
    return url;
  }
}
