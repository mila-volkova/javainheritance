public class Meeting extends Task {
    private String topic;
    private String project;
    private String start;


    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }


    public String getTopic() {
        return topic;
    }

    public String getproject() {
        return project;
    }

    public String getstart() {
        return start;
    }    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }

}
