package api.com;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paymentplans 
{
@JsonProperty("Title")
private String title;
@JsonProperty("Description")
private List<PaymentPlansFeatures> description;
@JsonProperty("Image")
private String image;

public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

public List<PaymentPlansFeatures> getDescription() {
	return description;
}
public void setDescription(List<PaymentPlansFeatures> description) {
	this.description = description;
}

}


