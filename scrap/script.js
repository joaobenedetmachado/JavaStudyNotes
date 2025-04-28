document.addEventListener('DOMContentLoaded', () => {
    const book = document.querySelector('.book');
    const pages = document.querySelectorAll('.page');
    let currentPage = 0;

    // Initialize page states
    function updatePageStates() {
        pages.forEach((page, index) => {
            page.classList.remove('active', 'next', 'previous');
            
            if (index === currentPage) {
                page.classList.add('active');
            } else if (index === currentPage + 1) {
                page.classList.add('next');
            } else if (index < currentPage) {
                page.classList.add('previous');
            }
        });
    }

    // Initialize first page
    updatePageStates();

    // Add click event to each page
    pages.forEach((page, index) => {
        page.addEventListener('click', () => {
            if (index === currentPage && currentPage < pages.length - 1) {
                currentPage++;
                updatePageStates();
            }
        });
    });

    // Add keyboard navigation
    document.addEventListener('keydown', (e) => {
        if (e.key === 'ArrowRight' && currentPage < pages.length - 1) {
            currentPage++;
            updatePageStates();
        } else if (e.key === 'ArrowLeft' && currentPage > 0) {
            currentPage--;
            updatePageStates();
        }
    });
}); 