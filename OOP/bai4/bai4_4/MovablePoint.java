package bai4.bai4_4;
    public class MovablePoint extends Point {
        private float speedx=0.0f;
        private float speedy=0.0f;
        public MovablePoint() {}
        public MovablePoint(float x, float y, float speedx, float speedy) {
            super(x, y);
            this.speedx = speedx;
            this.speedy = speedy;
        }
        public MovablePoint(float speedx, float speedy) {
            this.speedx = speedx;
            this.speedy = speedy;
        }

        public float getSpeedx() {
            return speedx;
        }

        public void setSpeedx(float speedx) {
            this.speedx = speedx;
        }

        public float getSpeedy() {
            return speedy;
        }

        public void setSpeedy(float speedy) {
            this.speedy = speedy;
        }
        public void setSpeed(float xspeed, float yspeed) {
            this.speedx = xspeed;
            this.speedy = yspeed;
        }
        public float []getSpeed(){
            float[] speed = new float[2];
            speed[0] = this.speedx;
            speed[1] = this.speedy;
            return speed;
        }
        @Override
        public String toString() {
            return super.toString()+", speed=("+speedx+","+speedy+")";
        }
        public MovablePoint move(){
            setX(getX() + speedx);
            setY(getY() + speedy);
            return this;
        }
    }

