// Smooth scrolling for navigation links
document.querySelectorAll('.nav-link').forEach(anchor => {
    anchor.addEventListener('click', function(e) {
        e.preventDefault();
        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});

// Mock download function
function downloadFile(department, year, subject = '') {
    const message = subject 
        ? `Downloading study material for ${subject} in ${department}, ${year}`
        : `Downloading syllabus for ${department}, ${year}`;
    alert(message);
}
