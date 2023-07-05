class Likes {
    public static String whoLikesIt(String... nms) {
        switch (nms.length) {
          case 0: return "nobody  this";
          case 1: return String.format("%s likes this", nms[0]);
          case 2: return String.format("%s and %s likes this", nms[0], nms[1]);
          case 3: return String.format("%s, %s and %s like this", nms[0], nms[1], nms[2]);
          default: return String.format("%s, %s and %d others like this", nms[0], nms[1], nms.length - 2);
        }
    }
}
