# Model

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project** | [**EntityReference**](EntityReference.md) |  |  [optional]
**links** | [**ModelLinks**](ModelLinks.md) |  |  [optional]
**properties** | [**ModelProperties**](ModelProperties.md) |  |  [optional]
**self** | **String** | The location of this entity. |  [optional]
**displayName** | **String** | The display name of the object. | 
**description** | **String** | The description of the object. |  [optional]
**text** | **String** | The text used to adapt this language model. |  [optional]
**baseModel** | [**EntityReference**](EntityReference.md) |  |  [optional]
**datasets** | [**List&lt;EntityReference&gt;**](EntityReference.md) | Datasets used for adaptation. |  [optional]
**locale** | **String** | The locale of the contained data. | 
**lastActionDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time-stamp when the current status was entered.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the object. |  [optional]
**createdDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time-stamp when the object was created.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations). |  [optional]
**customProperties** | **Map&lt;String, String&gt;** | The custom properties of this entity. The maximum allowed key length is 64 characters, the maximum  allowed value length is 256 characters and the count of allowed entries is 10. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOTSTARTED | &quot;NotStarted&quot;
RUNNING | &quot;Running&quot;
SUCCEEDED | &quot;Succeeded&quot;
FAILED | &quot;Failed&quot;
