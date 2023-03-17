package hw20;

public class AdditionalMaterials {
    private Integer id = 0;
    private String name;
    private ResourceType resourceType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public AdditionalMaterials() {
    }

    public AdditionalMaterials(Integer id) {
        this.id = id;
    }

    public AdditionalMaterials(Integer id, String name, ResourceType resourceType) {
        this.id = id;
        this.name = name;
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "AdditionalMaterials{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", resourceType=" + resourceType +
                '}';
    }
}
