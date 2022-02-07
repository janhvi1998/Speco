package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentPlansFeatures 
{
	@JsonProperty("FeatureNo")
	private String featureno;
	@JsonProperty("FeatureDescription")
	private String featuredescription;
	public String getFeatureno() {
		return featureno;
	}
	public void setFeatureno(String featureno) {
		this.featureno = featureno;
	}
	public String getFeaturedescription() {
		return featuredescription;
	}
	public void setFeaturedescription(String featuredescription) {
		this.featuredescription = featuredescription;
	}
	
}
