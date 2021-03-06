package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;
/**
 * PaginatedModels
 */


public class PaginatedModels {
  @SerializedName("values")
  private List<Model> values = null;

  @SerializedName("@nextLink")
  private String _atNextLink = null;

   /**
   * A list of entities limited by either the passed query parameters &#x27;skip&#x27; and &#x27;top&#x27; or their default values.                When iterating through a list using pagination and deleting entities in parallel, some entities will be skipped in the results.  It&#x27;s recommended to build a list on the client and delete after the fetching of the complete list.
   * @return values
  **/
  public List<Model> getValues() {
    return values;
  }

   /**
   * A link to the next set of paginated results if there are more entities available; otherwise null.
   * @return _atNextLink
  **/
  public String getAtNextLink() {
    return _atNextLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedModels paginatedModels = (PaginatedModels) o;
    return Objects.equals(this.values, paginatedModels.values) &&
        Objects.equals(this._atNextLink, paginatedModels._atNextLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, _atNextLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedModels {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    _atNextLink: ").append(toIndentedString(_atNextLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
