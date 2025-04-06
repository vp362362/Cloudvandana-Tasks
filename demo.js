const images = [
    "https://picsum.photos/id/1018/600/400",
    "https://picsum.photos/id/1015/600/400",
    "https://picsum.photos/id/1016/600/400",
    "https://picsum.photos/id/1020/600/400"
  ];
  
  let currentIndex = 0;
  
  const sliderImage = document.getElementById("sliderImage");
  
  // Function to show current image
  function showImage(index) {
    sliderImage.src = images[index];
  }
  
  // Show the first image on load
  showImage(currentIndex);
  
  // Next button function
  function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
  }
  
  // Previous button function
  function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
  }
  