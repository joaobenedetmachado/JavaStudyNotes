document.addEventListener('DOMContentLoaded', () => {
    // Variáveis do livro
    const book = document.querySelector('.book');
    const pages = document.querySelectorAll('.page');
    let currentPage = 0;

    // Variáveis do modal e carrossel
    const modal = document.getElementById('imageModal');
    const quickViewBtn = document.querySelector('.quick-view-btn');
    const closeModal = document.querySelector('.close-modal');
    const carouselContainer = document.querySelector('.carousel-container');
    const prevBtn = document.querySelector('.carousel-btn.prev');
    const nextBtn = document.querySelector('.carousel-btn.next');
    let currentSlide = 0;

    // Funções do livro
    function updatePageStates() {
        pages.forEach((page) => {
            const pageNumber = parseInt(page.dataset.page);
            page.classList.remove('active', 'next', 'previous');
            
            if (pageNumber === currentPage) {
                page.classList.add('active');
            } else if (pageNumber === currentPage + 1) {
                page.classList.add('next');
            } else if (pageNumber < currentPage) {
                page.classList.add('previous');
            }
        });
    }

    // Inicializar carrossel
    function initializeCarousel() {
        const images = Array.from(document.querySelectorAll('.page-content img'))
            .filter(img => img.src)
            .map(img => img.src);
        
        carouselContainer.innerHTML = '';
        
        images.forEach((src, index) => {
            const slide = document.createElement('div');
            slide.className = 'carousel-slide';
            slide.style.transform = `translateX(${index * 100}%)`;
            
            const img = document.createElement('img');
            img.src = src;
            img.alt = `Slide ${index + 1}`;
            
            slide.appendChild(img);
            carouselContainer.appendChild(slide);
        });
    }

    function updateCarousel() {
        const slides = document.querySelectorAll('.carousel-slide');
        slides.forEach((slide, index) => {
            slide.style.transform = `translateX(${(index - currentSlide) * 100}%)`;
        });
    }

    // Event Listeners
    pages.forEach((page) => {
        page.addEventListener('click', () => {
            const pageNumber = parseInt(page.dataset.page);
            if (pageNumber === currentPage && currentPage < pages.length - 1) {
                currentPage++;
                updatePageStates();
            }
        });
    });

    prevBtn.addEventListener('click', () => {
        if (currentSlide > 0) {
            currentSlide--;
            updateCarousel();
        }
    });

    nextBtn.addEventListener('click', () => {
        if (currentSlide < document.querySelectorAll('.carousel-slide').length - 1) {
            currentSlide++;
            updateCarousel();
        }
    });

    quickViewBtn.addEventListener('click', () => {
        modal.classList.add('active');
        initializeCarousel();
        document.body.style.overflow = 'hidden';
    });

    closeModal.addEventListener('click', () => {
        modal.classList.remove('active');
        document.body.style.overflow = '';
    });

    modal.addEventListener('click', (e) => {
        if (e.target === modal) {
            modal.classList.remove('active');
            document.body.style.overflow = '';
        }
    });

    document.addEventListener('keydown', (e) => {
        if (!modal.classList.contains('active')) {
            if (e.key === 'ArrowRight' && currentPage < pages.length - 1) {
                currentPage++;
                updatePageStates();
            } else if (e.key === 'ArrowLeft' && currentPage > 0) {
                currentPage--;
                updatePageStates();
            }
        } else {
            if (e.key === 'ArrowLeft' && currentSlide > 0) {
                currentSlide--;
                updateCarousel();
            } else if (e.key === 'ArrowRight' && currentSlide < document.querySelectorAll('.carousel-slide').length - 1) {
                currentSlide++;
                updateCarousel();
            } else if (e.key === 'Escape') {
                modal.classList.remove('active');
                document.body.style.overflow = '';
            }
        }
    });

    // Inicializar estado
    updatePageStates();
}); 