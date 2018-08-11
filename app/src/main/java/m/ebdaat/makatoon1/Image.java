package m.ebdaat.makatoon1;

public class Image {
        private int imageId;
        private String title;
        private String cost;

        public Image(int imageId, String title, String cost) {
            this.imageId = imageId;
            this.title = title;
            this.cost = cost;
        }

        public int getImageId() {
            return imageId;
        }

        public String getTitle() {
            return title;
        }

        public String getCost() {
            return cost;
        }
    }

